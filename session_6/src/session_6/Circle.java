package session_6;

public class Circle extends Processor {
	void process() {
		double area = Math.PI* data * data;
		System.out.println("Area of circle with radius" +data+ "is:" +area);
	}

}
