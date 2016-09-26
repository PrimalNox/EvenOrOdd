import java.lang.Math;
import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = kbReader.nextInt();
		
		if ((num%2)== 0)
		{
			System.out.println("The integer " + num + " is even.");
		}
		else
		{	
			System.out.println("The integer " + num + " is odd.");
		}
		
		}

}
