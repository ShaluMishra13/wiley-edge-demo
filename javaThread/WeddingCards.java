package javaThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Cards extends Thread{
	public void run() {
		System.out.println("Thread name:"+Thread.currentThread().getName());
	}
}
public class WeddingCards {

	public static void main(String[] args) {
		//ExecutorService ex=Executors.newFixedThreadPool(4);
		//ExecutorService ex=Executors.newCachedThreadPool();
		//for(int i=0;i<=100;i++) {
			//ex.execute(new Cards());
		//}
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(3);
		executor.scheduleWithFixedDelay(new Cards(),5,2,TimeUnit.SECONDS);
		

	}

}
