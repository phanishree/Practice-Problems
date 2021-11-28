class Q{
	public static  boolean f;	
	
synchronized void Produce(int i) {
		
		 while(i<10) {
	System.out.println("put:"+i++);
	f=true;
	notifyAll();
	if(f) 
	try {
	wait();
	Thread.sleep(1000);
	}catch(Exception e) {}
		 }
	}
synchronized void consume(int j) {
		
		 while(j<10){			 
			System.out.println("get:"+j++);
			f=false;
			notifyAll();
			if(!f)
			try {
			wait();
			Thread.sleep(1000);
			}catch(Exception e) {}
				 }
		}
}
class producer extends Thread{
	Q obj1;
	producer(Q obj){
		obj1=obj;
	}
	public void run() {
		obj1.Produce(0);
	}	
}
class consumer extends Thread{
	
	Q obj2;
	consumer(Q obj){
		obj2=obj;
	}
	public void run() {
		obj2.consume(0);
	}
}
public class PandC {

public static int oo=1;
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Q obj=new Q();
Thread p=new producer(obj);
Thread c=new consumer(obj);
p.start();
c.start();
  }
}
