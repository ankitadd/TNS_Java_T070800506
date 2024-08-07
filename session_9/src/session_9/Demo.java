package session_9;

public class Demo {
public static void main(String[] args) {
		
		//Primitive to Wrapper:boxing
		int no=100;
		Integer i=new Integer(no);
		
		//Wrapper to Primitive:unboxing
		int a=i.intValue();
		
		 //String to primitive
		String str="30";
		int b=Integer.parseInt(str);
		
		//String to Wrapper
		Integer c=Integer.valueOf(str);
		
		//Autoboxing
		int e=90;
		Integer s=e;
		
		//Autounboxing
		int u=s;
	}

}
