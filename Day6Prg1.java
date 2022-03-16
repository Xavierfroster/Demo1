package Demo;

public class Day6Prg1 {

	int a;
	int b;
	
	void add()
	{
		a=10;
		b=20;
		System.out.println("Sum = " + (a+b));
	}
	
	void subtract()
	{
		a=100;
		b=20;
		System.out.println("Sub = " + (a-b));
	}
	
	void div()
	{
		a=40;
		b=2;
		System.out.println("Div = " + (a/b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day6Prg1 d = new Day6Prg1();
		d.add();
		d.subtract();
		d.div();

	}

}
