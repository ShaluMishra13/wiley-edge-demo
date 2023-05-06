package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericClass {
	public static void main(String[] args) {

		Printer<Integer> print1 = new Printer(5);
		print1.print();

		Printer<String> print = new Printer("hello");
		print.print();
		Printer<cat> print2 = new Printer(new cat());
		print2.print();
		
		Printer<Dog> printer1 = new Printer(new Dog());
		printer1.print();
		ArrayList<Object> cats = new ArrayList<>();
		cats.add(new cat());
		cats.add(new cat());
		cats.add(new Dog());
		//shout("Tame me to movie",5);
		//shout("Bring necklace",8);
		shout("Amount", 20000);
		//shout();
		
		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		printList(intList);
		
		List<cat> catList = new ArrayList<>();
		catList.add(new cat());
		printList(catList);
	}
	
	private static void printList(List<?> myList) {
		System.out.println(myList);
	}
	
	private static <T,V> T shout(T shoutOUt, V valtoBring ) {
		System.out.println(shoutOUt + " ...!!!!");
		System.out.println(valtoBring + " ...!!!!");
		
		return shoutOUt;
	} 
}

