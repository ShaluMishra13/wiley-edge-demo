package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="The key to learn programming is consistent practice";
		Pattern pat=Pattern.compile("learn");
		Matcher matcher=pat.matcher(input);
		if(matcher.find()) {
			int strt=matcher.start();
			int en=matcher.end();
			System.out.println("Foud match form index "+strt+" to "+(en-1));
		}
		String patt="learn";
		int ind=input.indexOf(patt);
		if(ind!=-1) {
			System.out.println(ind);
		}
		
		

	}

}
