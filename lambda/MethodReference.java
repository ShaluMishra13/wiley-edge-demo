package lambda;
interface Sayable{
	void say();
}
public class MethodReference {
	public static void saySomething() {
		System.out.println("Hello , this is static method.");
}
	public static void processSomething() {
		System.out.println("processing");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReference mt=new MethodReference();
		Sayable isv=mt::hello;
		isv.say();
			Sayable sayable=
					MethodReference::saySomething;
			sayable.say();
			Thread t1=new Thread(MethodReference::processSomething);
			t1.start();
			
	}

}
