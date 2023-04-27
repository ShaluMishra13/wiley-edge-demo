package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String cardNumber="3456-4567-1234-6677";
       Pattern pat=Pattern.compile("\\d{4}-\\d{4}-\\d{4}");
       Matcher mat=pat.matcher(cardNumber);
       String maskcard=mat.replaceAll("xxxx-xxxx-xxxx-");
       System.out.println(maskcard);
       
	}

}
