package optimizations;

public class StringOptimization {
public static void main(String[]args) {
	long start=System.currentTimeMillis();
	String str="";
	for(int i=0;i<10000;i++) {
		str=str+'i';
	}
	long end=System.currentTimeMillis();
	System.out.println(end-start);
	StringBuilder st=new StringBuilder();
	start=System.currentTimeMillis();
	for(int i=0;i<10000;i++) {
		st=st.append(i);
		
	}end=System.currentTimeMillis();
	System.out.println(end-start);
	
}
}
