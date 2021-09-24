package fileupload;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class MyInfoFileUploader {
	private final String saveDirectory = "C:\\Ãë¾÷¹Ý\\3.JSP\\workspace-jsp\\project1\\WebContent\\profilePic";
	private final int maxSize = 1024 * 1024 * 10;
	private final String encType = "UTF-8";
	private final String path = "../profilePic/";
	private String origianlFileName;
	private String systemFileName;
	private String profilePic;
	File file;
	MultipartRequest multi = null;
	
	private int age;
	private String name, email, introduction;
	
	public MyInfoFileUploader(HttpServletRequest request) {
		try {
			multi = new MultipartRequest(
					request, saveDirectory, maxSize, encType,
					new DefaultFileRenamePolicy()
					);
			systemFileName = multi.getFilesystemName("profilePic");
			age = Integer.parseInt(multi.getParameter("age"));
			name = multi.getParameter("name");
			email = multi.getParameter("email");
			introduction = multi.getParameter("introduction");
			profilePic = path + systemFileName;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getOrigianlFileName() {
		return origianlFileName;
	}

	public void setOrigianlFileName(String origianlFileName) {
		this.origianlFileName = origianlFileName;
	}

	public String getSystemFileName() {
		return systemFileName;
	}

	public void setSystemFileName(String systemFileName) {
		this.systemFileName = systemFileName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	
}
