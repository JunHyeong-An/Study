package springbook.user.service;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.sql.DataSource;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import springbook.user.dao.UserDAO;
import springbook.user.domain.Level;
import springbook.user.domain.User;

public class NormalUpgradeLevel implements UserUpgradeLevelPolicy {
	private UserDAO userDAO;
	private MailSender mailSender;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	@Override
	public void upgradeLevel(User user) {
		user.upgradeLevel();
		userDAO.update(user);
		sendUpgradeEmail(user);
	}
	
	@Override
	public boolean canUpgradeLevel(User user) {
		switch (user.getLevel()) {
		case 1:
			return (user.getLogin() >= UserService.MIN_LOGCOUNT_FOR_SILVER);
		case 2:
			return (user.getRecommand() >= UserService.MIN_RECCOMNED_FOR_GOLD);
		case 3:
			return false;

		default: 
			throw new IllegalArgumentException("UnkwonLevel : " + user.getLevel());
		}
	}
	
	private void sendUpgradeEmail(User user) {
		
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		
		mailMessage.setTo(user.getEmail());
		mailMessage.setFrom("useradmin@kgsu.com");
		mailMessage.setSubject("Upgrade 안내");
		mailMessage.setText(user.getName() + "(" + user.getId() + ")님의 등급이 " + Level.valueOf(user.getLevel()) +"로 업그레이드 되었습니다.");
		
		this.mailSender.send(mailMessage);
	}
	
//	private void sendUpgradeEmail(User user) {
//		Properties props = new Properties();
//		props.put("mail.smtp.host", "mail.ksug.org");
//		Session s = Session.getInstance(props, null);
//		
//		MimeMessage message = new MimeMessage(s);
//		try {
//			message.setFrom(new InternetAddress("useradmin@ksug.org"));
//			message.addRecipient(Message.RecipientType.TO, 
//					new InternetAddress(user.getEmail()));
//			message.setSubject("Upgrade 안내");
//			message.setText("사용자 님의 등급이 " + Level.valueOf(user.getLevel()) +"로 업그레이드 되었습니다.");
//			
//			Transport.send(message);
//		} catch (AddressException e) {
//			throw new RuntimeException(e);
//		} catch (MessagingException e) {
//			throw new RuntimeException(e);
//		}
//	}
}
