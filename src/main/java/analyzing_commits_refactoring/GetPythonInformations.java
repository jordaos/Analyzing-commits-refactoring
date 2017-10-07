package analyzing_commits_refactoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetPythonInformations {
	public static String getClassification(String location_classificator, String branch, String sha, String method) {
		try {
			ProcessBuilder ps = new ProcessBuilder("python", location_classificator, branch, sha, method);
			ps.redirectErrorStream(true);

			Process pr = ps.start();  
			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = in.readLine();
			//while ((line = in.readLine()) != null) {
			    System.out.println("LOG: " + line);
			//}
			pr.waitFor();

			in.close();
			return line;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
