package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern pat=Pattern.compile("Wiley \\d\\d\\d");
		Matcher mat=pat.matcher("Wiley 0097");
		Pattern patt=Pattern.compile("^[a|A]gent (\\d{3,4})$");
		Matcher matt=patt.matcher("agent 0007");
		//boolean f=matt.find();
		//System.out.println(f);
		//boolean f1=matt.matches();
		//System.out.println(f1);
		if(matt.find()) {
	System.out.println("group:"+matt.group());
	System.out.println("gruop: "+matt.group(1));
		}

	}

}
