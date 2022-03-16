package Demo;

import java.util.*;

public class Day8Prg1 {
	
	String cname;
	int duration ;
	int fees;
	void add()
	{
		Scanner scan= new Scanner(System.in);// to take input from console
		System.out.println("enter course name");
		cname=scan.next(); // c -- scanf()
		System.out.println("enter course duration");
		duration =scan.nextInt();//c++  cin 
		System.out.println("enter course fees");
		fees=scan.nextInt();
		
	}
	
	void display()
	{
		System.out.println(" course name="    + cname);
		System.out.println(" course duration="+ duration);
		System.out.println(" course fees="    + fees);
	}


}
