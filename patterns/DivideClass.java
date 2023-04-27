package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DivideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat=Pattern.compile("^(\\d+) divide by (\\d+)$");
		Matcher match=pat.matcher("10 divide by 5");
		if(match.find()) {
			String simplified="result=" +match.replaceFirst("$1/$2");
			System.out.println(simplified);
			System.out.println(match.group(1));
			
			int res = Integer.valueOf(match.group(1)) / Integer.valueOf(match.group(2));
			//int res = Integer.parseInt("$1") / Integer.parseInt("$2");
			
			System.out.println("Final Results: " + res);
			
		}

	}

}
