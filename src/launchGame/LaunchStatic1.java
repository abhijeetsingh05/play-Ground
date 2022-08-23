package launchGame;

public class LaunchStatic1 {

	LaunchStatic1(){
		System.out.println("Start of Counstructor");
	}
	static int a, b, c;

	int m, n, o;

	static {
		System.out.println("Start of static block1");
		a = 10;
		b = 20;
		c = 30;

	}

	static {
		System.out.println("start of static block2");
		a = 40;
		b = 50;
		c = 60;
	}

	{
		System.out.println(" Start of the instance block");
		m = 100;
		n = 200;
		o = 300;
	}

	static void display1() {
		System.out.println("Start of the static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	void display2() {
		System.out.println("Start of the instance method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

	public static void main(String[] args) {
		System.out.println("Start of main method");
		display1();
		LaunchStatic1 l = new LaunchStatic1();
		l.display2();

	}

}
