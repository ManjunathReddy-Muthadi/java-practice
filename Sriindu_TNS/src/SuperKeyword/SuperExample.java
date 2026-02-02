package SuperKeyword;

public class SuperExample {
	int a=10;
	SuperExample(int a){
		System.out.println("Parent class constructor");
	}
	public void display() {
		System.out.println("parent class display method");
	}
}
class Demo extends SuperExample{
	int a=20;
	Demo(){
		super(30);//calling parent class constructor
		System.out.println("Child class constructor.");
		System.out.println("a="+super.a);//calling parent class variable
	}
	public void display() {
		super.display();//calling parent class method
		System.out.println("Child class display method");
	}
	
}


