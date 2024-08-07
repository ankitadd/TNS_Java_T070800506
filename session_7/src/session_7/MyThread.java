package session_7;

public class MyThread extends Thread
//internally implementing Runnable
{
	public void  run()
	{
		//Resource
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread ();
		MyThread t2 = new MyThread ();
		MyThread t3 = new MyThread ();//Born
		
		t1.start();
		t2.start();
		t3.start();//Runnable
		
		///Thread Scheduler - part of JVM
	}
}
