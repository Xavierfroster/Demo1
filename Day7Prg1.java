package Demo;

import java.util.*;


public class Day7Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter the no:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		if (a%2==0)
		{
			System.out.println("No is Even = " + a);
		}
		else
		{
			System.out.println("NO is odd = " + a);
		}
		

	}

}
