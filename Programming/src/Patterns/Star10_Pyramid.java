package Patterns;

import java.util.Scanner;

public class Star10_Pyramid 
{
 public static void print(int r)
 {
	 for(int i=1;i<=r;i++)  // for row
	 {
		 for(int j=1;j<=(r-i);j++) //for space
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=(2*i-1);k++) // for star
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
 }
 public static void main(String[] args)
 {
	 
	 Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter row");
			int r=sc.nextInt();
			
			print(r);		
		}
	}
	

}
