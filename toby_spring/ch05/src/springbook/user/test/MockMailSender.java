package springbook.user.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

import springbook.user.service.MailSender;

public class MockMailSender implements MailSender {
	public List<String> requests = new ArrayList<String>();
	
	public List<String> getRequests() {
		return requests;
	}
	@Override
	public void send(SimpleMailMessage simpleMessage) throws MailException {
		// TODO Auto-generated method stub

	}
	@Override
	public void send(SimpleMailMessage[] simpleMessages) throws MailException {
		// TODO Auto-generated method stub

	}
}
