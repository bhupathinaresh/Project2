package javaPackage;

public class EvenorOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		if (n%2==0)
		{
			System.out.println("Give number is even number");
			
		}
		else
		{
			System.out.println("Give number is odd number");
		}
		
		int i = 20;
		/*
		 * while (i>=0) { System.out.println("Print number is: " +i); //i=i+2; i--; }
		 */
		
		do
		{	System.out.println("Number is: " +i);
			i++;
		}
		while(i<=10);

	}

}
