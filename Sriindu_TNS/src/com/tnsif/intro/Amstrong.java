package com.tnsif.intro;
import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the Number = ");
		int num = sc.nextInt();
        int temp = num;
        int digits = 0;
        int sum = 0;
        //count digits
        while(temp > 0)
        {
        	digits++;
        	temp = temp/10;
        }
        //calculate amstrong sum
        temp = num;
        while(temp > 0)
        {
        	int digit = temp % 10;
        	sum = sum + (int)Math.pow(digit,digits);
        	temp = temp/ 10;
        }
		// check result
        if(sum == num)
        {
        	System.out.print("The Given Number is Amstrong Number");
        }
        else {
        	System.out.println("The Given Number is Not an Amstrong Number");
        }
        
        }

}
