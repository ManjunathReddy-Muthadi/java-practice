package com.tnsif.intro;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
			{
				count++;
			}
			if(count == 2)
			{
				System.out.print("The Given Number is Prime Number");
				break;
			}
			else {
				System.out.print("The Given Number is Not Prime Number");
				break;
			}
		}
		
		
	}

}
