package javaThread;

class parent{
	public void m1() {
		System.out.println("This is m1 meth");
	}
}
class T1 extends Thread{
	public void run() {
		System.out.println("By using thread class");
	}
}
class T2 extends parent implements Runnable{
	public void run() {
		m1();
		System.out.println("By using Runnable Interface");
	}
}

public class ThreadComcept {	
	public static void main(String[]args) {
		T1 t1=new T1();
		t1.start();
		T2 t2=new T2();
		
		Thread trd=new Thread(t2);
		trd.start();
		
	}
}
