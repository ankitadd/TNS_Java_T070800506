
public class Person{
    private int age;
    private String name; 
    
public Person (String name,int age) {
	if(age > 0) {
		this.age=age;
	} else {
		System.out.println("Age cannot be negative.Setting Age to default 18");
		this.age=18;
	}
	this.name = name;
}

public Person (String name) {
	this(name,18);
}

public void display() {
	System.out.println("Name : " +name +"   " +"Age  :" +age);
 }
    
 public static void main(String[] args) {
  Person person1 = new Person("Ankita");
  person1.display();
  
  Person person2 = new Person("Anisha",20);
  person2.display();
  
  Person person3 = new Person("Harshal",-5);
  person3.display();
  
 }
}
