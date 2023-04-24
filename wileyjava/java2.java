package wileyjava;

abstract class test1{
	{
	System.out.println("test1 instance block ");
	}
	static {
		System.out.println("test1 static block");
	}
	public abstract void m1();
	public static void main(String[]args) {
		System.out.println("this is main in abstract class");
	}
	public void m2() {
		System.out.println("meth in abstract class");
	}
}
class test2 extends test1{
	public void m1() {
		System.out.println("implementing abstract meth in test2");
	}
}
public class java2 {
	
   public static void main(String[]args) {
	   System.out.println("hi");
	   test2 t2=new test2();
	   t2.m1();
	   test2 t3=new test2();
	   
	   t2.m2();
	   test1.main(args);
   }
}
