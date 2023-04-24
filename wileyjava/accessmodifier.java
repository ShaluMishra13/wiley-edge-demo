package wileyjava;

class testing{
	public void meth1() {
    	System.out.println("public meth");
    }
    
    protected void meth2() {
    	System.out.println("protected class");
    }
    public String name;
    int age;//default accessfier
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	private double accbalance;
    private String holdername;
    private int accno;
	public double getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}    
}
public class accessmodifier {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 testing ac=new testing();
         ac.meth1();
         ac.meth2();
         ac.setAccbalance(5677.56);
         ac.setAccno(45678);
         ac.setHoldername("Shalu");
         ac.setAge(22);
         System.out.println(ac.getAccbalance());
         System.out.println(ac.getHoldername());
         System.out.println(ac.getAccno());
         System.out.println(ac.getAge());
         
        // ac.meth3();not visible
	}

}
