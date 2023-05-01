package javaThread;

class Demo implements Runnable{
	String name;
	public void run() {
		//for(int i=0;i<100;i++) {
		System.out.println("Thread Name:-"+Thread.currentThread().getName()+"  started");
		for(long i=0;i<100000000;i++) {
			for(long j=0;j<100000000;j++) {
				continue;
			}
			continue;
		}
		System.out.println("Thread Name:-"+Thread.currentThread().getName()+" ended");
	}
}
public class ThreadGroupConcept {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   ThreadGroup tgParent =new ThreadGroup("Parent Group");
   ThreadGroup tgChild=new ThreadGroup(tgParent, "chid group");
   
   
   
   Thread t1=new Thread(tgParent,new Demo(),"First");
   Thread t2=new Thread(tgParent,new Demo(),"Second");
   Thread t3=new Thread(tgChild,new Demo(),"Third");
   t1.start();
   t2.start();
   t3.start();
   
   //t1.sleep(50);
  // t2.sleep(50);
   //t3.sleep(50);
   
   System.out.println("Active group of threads: "+tgParent.activeCount());
   System.out.println("child group of threads: "+tgChild.activeCount());
   
   tgParent.list();
	}

}
