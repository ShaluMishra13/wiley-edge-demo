package wileyjava;
interface Bank{
	void account();
}
interface Bank1{
	void account();
}
interface ATM extends Bank,Bank1{
	void insertCard();
	void selectOption();
	void enterPassword();
}
interface AA{
	void m1();
}
abstract class NewATM implements ATM,AA{
	public void account() {
		System.out.println("enter acc no.:");
	}
	public void m1() {
		System.out.println("This is m1 meth");
	}
}
public class interfaces extends NewATM{
	public void insertCard() {
		System.out.println("insert card");
	}
	public void selectOption() {
		System.out.println("enter your option");
	}
	public void enterPassword() {
		System.out.println("enter your password");
	}
	public static void main(String []args) {
		interfaces in=new interfaces();
		in.insertCard();
		in.enterPassword();
		in.selectOption();
		in.account();
		in.m1();
	}
	
}
