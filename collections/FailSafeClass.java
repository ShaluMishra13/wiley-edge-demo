package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class FailSafeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String>hm=new ConcurrentHashMap<>();
	hm.put(1,"java");
	hm.put(1, "C++");
	hm.put(2, "Pyton");
	Iterator it =hm.keySet().iterator();
	while(it.hasNext()) {
		Integer k=(Integer)it.next();
		System.out.println(k+":"+hm.get(k));
		hm.put(3, "golang");
	}
	}

}
