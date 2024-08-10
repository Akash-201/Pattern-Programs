package LOOPS;

import java.util.Scanner;

public class Evenseries 
{
 public static void print(int n)
 {
	 int x=2;
	 for(int i=1;i<=n;i++)
	 {
		 System.out.println(x+" ");
		 x=x+2;
	 }
 }
 public static void main(String[] args)
 {
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	print(n);
	sc.close();
	
}
	

}
