package collections;

import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>ss =new HashMap<>();
		ss.put("a","A");
		ss.put("b", "B");
		ss.put("c", "C");
		ss.put(null, "nullval");
		ss.put(null,null);
		ss.put("e", null);
		System.out.println(ss);
		System.out.println(ss.get("c"));
		System.out.println(ss.containsKey("b"));
		System.out.println(ss.containsValue("B"));
		ss.replace("e","t");
		ss.putIfAbsent("k", "fj");
		System.out.println(ss.get("z"));
		
		LinkedHashMap hm=new LinkedHashMap();
		hm.put("a",1);
		hm.put(8,8);
		hm.put(null,7);
		System.out.println(hm);
		

	}

}
