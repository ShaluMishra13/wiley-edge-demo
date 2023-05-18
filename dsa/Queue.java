package dsa;

public class Queue {
    int size=5;
    int items[]=new int[size];
    int front,rear;
    public Queue() {
    	front=-1;
    	rear=-1;
    }
    public boolean isFull() {
    	if(rear==size-1)
    		return true;
    	else return false;
    }
    public boolean isEmpty() {
    	if(front==-1)
    		return true;
    	else return false;
    }
    void enqueue(int e) {
    	if(isFull()) {
    		System.out.println("Queue is full");
    		}
    		else {
    			if(isEmpty())
    			{	front++;rear=front;items[rear++]=e;
    			System.out.println("Inserted:"+e);}
        		else {
        			items[rear++]=e;
        		System.out.println("Inserted:"+e);
    		}
    		}
    }
    int dequeue(){int e=-1; 
    	if(isEmpty()) {
    		//System.out.println("Queue is empty");
    		return e;
    	}else
    	{ e=items[front];
    	front++;	
    	}
    	return e;
    }
    void display() {
    	int ptr=front;
    	if(isEmpty())
    		System.out.println("queue is empty");
    	else {
    	while(ptr<rear) {
    		System.out.print(items[ptr]+" ");
    		ptr++;
    	}System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		boolean p=q.isEmpty();
		System.out.println("Items is empty:"+p);
		boolean t=q.isFull();
		System.out.println("items is full:"+t);
		int s=q.dequeue();
		System.out.println(s);
		q.display();
		
		q.enqueue(5);
		//System.out.println("hi");
		q.enqueue(7);
		
		q.enqueue(5);
		
		q.enqueue(8);
		
		q.display();
		int r=q.dequeue();
		System.out.println("dequeued value:"+r);
		int u=q.dequeue();
		System.out.println("dequeued value:"+u);
		q.display();
		q.isFull();
		System.out.println("items is full:"+t);

	}


}
