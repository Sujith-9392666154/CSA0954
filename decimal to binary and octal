import java.util.Scanner;
import java.io.*;

class Main
{
	
	static void decToBinary(int n)
	{
		
		int[] binaryNum = new int[1000];

		
		int i = 0;
		while (n > 0)
		{
			
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}

	
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}
	
	
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the decimal:");
		int n=sc.nextInt();
	    System.out.print("Binary - ");
		decToBinary(n);
		System.out.print("\r\n");
		String OctalVal = Integer.toOctalString(n);
		System.out.print("octal     = " + OctalVal);
		
	
		
	}
}
