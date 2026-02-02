package ThisKeyword;

public class ThisExample {
	int a=10;
	ThisExample(){
		int a=20;
		System.out.println("Default constructor");
		System.out.println("Local variable a="+a);//local variable
		System.out.println("Instance variable a="+this.a);//calling instance variable
	}
	ThisExample(int a){
		this();//calling default constructor from parameterized constructor
		System.out.println("This is 1-parameter constructor. ");

}
}
