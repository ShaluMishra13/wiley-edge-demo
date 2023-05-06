package lambda;

import java.util.Collections.*;
import java.util.function.*;
import java.util.*;
public class BuiltInFunction {
private static HashMap<Integer,String>emp=new HashMap<>();
public static void add(String name,int ID) {
	if(!emp.containsKey(ID))
		emp.put(ID,name);
	else
		System.out.println("Employee already exsit");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<Integer,String>get=(Integer ID)->{
	if(emp.containsKey(ID))return emp.get(ID);
	else return "Invalid ID";
};
add("Shalu",101);
add("Mishra",123);
//System.out.println(get.apply(101));
System.out.println("ID = 101, Name= "+ get.apply(101));
	}

}
