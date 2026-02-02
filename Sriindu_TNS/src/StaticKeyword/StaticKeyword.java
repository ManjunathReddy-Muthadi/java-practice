package StaticKeyword;

public class StaticKeyword {
	static int a=10;
	static {
		System.out.println("static initialization block.");
	}
	static public void display() {
		System.out.println("static display method.");
	}

}
