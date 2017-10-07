package analyzing_commits_refactoring;

import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;

import refdiff.core.RefDiff;
import refdiff.core.api.GitService;
import refdiff.core.rm2.model.refactoring.SDRefactoring;
import refdiff.core.util.GitServiceImpl;

public class Main {
    public static void main(String[] args){
    	String branch = "branch-0.3";
    	
    	RefDiff refDiff = new RefDiff();
    	GitService gitService = new GitServiceImpl();
    	try {
    		MakeMDFile makeMD = new MakeMDFile(branch);
    		Repository repository = gitService.cloneIfNotExists("/home/jordao/Downloads/hadoop_versions/" + branch + "/hadoop", "https://github.com/apache/hadoop.git");
    		Git git = Git.wrap(repository);
    		Iterable<RevCommit> commits = git.log().all().call();
    		for (RevCommit commit : commits) {
    			if(!commit.getName().equals("1e3ec8df8ac728b89f2b3b750d330f0ec3fd2ad6") ){
    				makeMD.initMessage();
    				List<SDRefactoring> refactorings = refDiff.detectAtCommit(repository, commit.getName());
    	    	    if(refactorings.size() > 0) {
    	    	    	makeMD.makeTitle1(commit.getName());
    	    	    	String classification = GetPythonInformations.getClassification(
    	    	    			"/home/jordao/MEGAsync/projeto_bolsa/Analyzing-project-feelings/src/verify-commit-classification.py", 
    	    	    			branch, 
    	    	    			commit.getName(), 
    	    	    			"manual");
    	    	    	makeMD.makeTitle2("Classification: " + classification);
    	    	    	makeMD.makeTitle2(refactorings.size() + " refatorações:");
    	    	    	for (SDRefactoring refactoring : refactorings) {
        	    	        makeMD.addListItem(refactoring.toString());
        	    	    }
    	    	    }
    	    	    makeMD.write();
    			}
    		}
    		makeMD.close();
    	}catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	System.out.print("Terminou");
    }
}