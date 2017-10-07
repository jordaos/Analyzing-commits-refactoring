package analyzing_commits_refactoring;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class MakeMDFile {
	private PrintWriter writer;
	private String message;
	
	public MakeMDFile(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated constructor stub
		this.writer = new PrintWriter("/home/jordao/eclipse-workspace/analyzing_commits_refactoring/src/main/resources/" + fileName, "UTF-8");
	}
	
	public void initMessage() {
		message = "";
	}
	
	public void makeTitle1(String title) {
		message += "# " + title + "\n";
	}
	
	public void makeTitle2(String title) {
		message += "## " + title + "\n";
	}
	
	public void addListItem(String item) {
		message += "- " + item + "\n";
	}
	
	public void write() {
		writer.print(message);
		initMessage();
	}
	
	public void close() {
		writer.close();
	}
}
