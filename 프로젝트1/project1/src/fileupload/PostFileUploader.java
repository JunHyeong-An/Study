package fileupload;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class PostFileUploader {
	private final String saveDirectory = "C:\\Ãë¾÷¹Ý\\3.JSP\\workspace-jsp\\project1\\WebContent\\boardPic";
	private final int maxSize = 1024 * 1024 * 10;
	private final String encType = "UTF-8";
	private final String path = "../boardPic/";
	
	private String writer;
	private String content;
	private String img;
	private int idx;
	
	File file;
	MultipartRequest multi = null;
	
	public PostFileUploader(HttpServletRequest request) {
		try {
			multi = new MultipartRequest(
					request, saveDirectory, maxSize, encType,
					new DefaultFileRenamePolicy()
					);
			writer = multi.getParameter("writer");
			content = multi.getParameter("postText");
			img = path + multi.getFilesystemName("postFile");
			idx = Integer.parseInt(multi.getParameter("idx"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	
}
