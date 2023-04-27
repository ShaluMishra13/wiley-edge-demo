package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	public static void main(String[]args) {
		//String re="..";//this pattern needed to find(will match any thing) 
		////String text="ss$";//wil search in this string
		//String res="\\w\\W.";//(a-z,A-Z,0-9..)
		//String text=" ";
		//String res="\\s";
		String res="\\D";
		String text="@";
		
		Pattern patt=Pattern.compile(res);
		Matcher match=patt.matcher(text);
		 Pattern pat=Pattern.compile(res);
		 Matcher mat=pat.matcher(text);
		boolean result=mat.matches();
		System.out.println(result);
	}
	

}
