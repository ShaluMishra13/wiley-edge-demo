package Random;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency usd =Currency.getInstance("USD");
		NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedval=frm.format(108.5);
		System.out.println(formattedval);
		
		NumberFormat numFormat2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String inrValue = numFormat2.format(100);
		System.out.println(inrValue);
		
		double price=2000.25;
		Locale local=new Locale("en","US");
		NumberFormat frm1 = NumberFormat.getCurrencyInstance(local);
		String formattedval1=frm.format(price);
		System.out.println(formattedval1);
		
		DecimalFormat decimalFormatter=new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("$");
		String resval=decimalFormatter.format(price);
		System.out.println("custom format:"+resval);
		
		Currency cur=Currency.getInstance("USD");
		String Sysmbol=cur.getSymbol();
		String code=cur.getCurrencyCode();
		System.out.println(Sysmbol);
		System.out.println(code);
		
		
		
		
		
	}

}
