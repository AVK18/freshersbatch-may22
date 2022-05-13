package SamplePro;

import java.util.Scanner;

public class A
{
  public static void main(String[] args)
  {
	  Scanner sc= new Scanner(System.in);
	  int n = sc.nextInt();
	  int num=n;
	  int rem=0;
	  int sum=0;
	  while(n!=0)
	  {
		  rem=n%10;
		  sum=sum+rem;
		  n=n/10;
	  }
	  if(num%sum==0)
	  {
		  System.out.print("Harshad Number");
	  }
	  else
	  {
		  System.out.print("Is not a Harshad Number");
	  }
   }
}