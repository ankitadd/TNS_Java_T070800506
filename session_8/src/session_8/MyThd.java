package session_8;

public class MyThd implements Runnable{
	
		public void  run()
		{
			for (int i=1; i<=3; i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		public static void main(String[] args) {
			
			MyThd r1 = new MyThd ();//Born
			Thread t1 = new Thread (r1);
			MyThd r2 = new MyThd ();
			Thread t2 = new Thread (r2);
			
			t1.setName("one");
			t2.setName("two");
			
			t2.setPriority(Thread.MAX_PRIORITY);
			
			t1.start();
			t2.start();//Runnable
			
		}
}
