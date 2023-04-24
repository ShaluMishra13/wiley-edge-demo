package wileyjava;
class Employee{
	private String name;
	private int age;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
}
class emplyimpl{
	public void show(Employee emp) {
		System.out.println("calling show method");
		System.out.println("Name:"+emp.getname()+" age:"+emp.getage());
	}
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setname("Shalu");
		emp.setage(22);
		emplyimpl em=new emplyimpl();
		em.show(emp);

	}

}
