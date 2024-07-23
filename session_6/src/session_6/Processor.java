package session_6;

public abstract class Processor {
	int data;
	abstract void process();
	
	void showData() {
		System.out.println("Data: "+ data);
	}

}
