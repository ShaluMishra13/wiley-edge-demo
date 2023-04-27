package stringClasses;

public class string_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Wiley";
		String s2="Wiley";
		String s3= new String("Wiley");
		String s4=new String("Wiley");
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s4==s3);
		System.out.println(s4.equals(s3));
		
		String str="Iam java devloper ";
		String str1="Python";
		String fname="shiv ";
		String mname="kr";
		String lname="Singh";
		String fullname=fname.concat(mname).concat(" ").concat(lname);
		System.out.println(fullname);
		String str2=str.concat(str1);
		System.out.println(str2.length());
		System.out.println(str2);
		System.out.println(str2.replace("Python","c++" ));
		
		String[] strarray=str2.split(" ");
		for(String words:strarray) {
			System.out.println(words);
		}
		
		String input="  Shalu  ";
		System.out.println(input.trim());
		System.out.println(str2.substring(0,18));
		
	}

}
