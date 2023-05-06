package collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<Integer,String>();
		tmap.put(3000,"Shalu");
		tmap.put(5600, "Mishra");
		tmap.put(1000, "hello");
		tmap.put(677,"java");
		System.out.println(tmap);
		tmap.forEach((k,v)->System.out.println("key:"+k+"-val:"+v));
		System.out.println(tmap.lastKey());
		System.out.println(tmap.firstKey());
        Set<Integer>keysLessThan3K=tmap.headMap(3000).keySet();
        Set<Integer>keysequalormoreThan3K=tmap.tailMap(3000).keySet();
        System.out.println(keysLessThan3K);
        System.out.println(keysequalormoreThan3K);
	}

}
