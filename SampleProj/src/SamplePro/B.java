package SamplePro;

import java.util.Scanner;

public class B
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int n =sc.nextInt();
	   int sum=0;
	   int rem=0;
	   int temp=n;
	   String num=Integer.toString(n);
	   int len=num.length();
	   while(n>0)
	   {
		   rem=n%10;
		   sum=sum+(int)(Math.pow(rem, len));
		   n=n/10;
	   }
	   if(temp==sum)
	   {
		   System.out.print("Amstrong number");
	   }
	   else
	   {
		   System.out.print("Not Amstrong number");
	   }
   }
}