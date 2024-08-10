package Array;

import java.util.Scanner;

public class Rotate_Left 
{
	public static void Print(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	
  public static int[] rotate(int[] num)
  {
	  int first=num[0];  // 1st step
	  for(int i=0;i<=num.length-2;i++) //step 2
	  {
		  num[i]=num[i+1];
	  }
	  num[num.length-1]=first; // step 3
	     Print(num);
	  return num;
  }
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int n=sc.nextInt();
	int[] num=new int[n];
	System.out.println("enter int element");
	for(int i=0;i<=num.length-1;i++)
	{
		num[i]=sc.nextInt();
	}
	rotate(num);
}
	

}
