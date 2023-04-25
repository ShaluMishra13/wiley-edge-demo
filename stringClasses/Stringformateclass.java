package stringClasses;

import java.util.*;

public class Stringformateclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title="Java Devloper";
		float salary=3456.567f;
		System.out.format("%s has %.2f Usd salary\n",title,salary);
		
		List<String>techStack =Arrays.asList("core java","advance java","java design");
		for (String books:techStack) {
			System.out.format("%.30s - in stock\n",books);
		}
	}

}
