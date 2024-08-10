package Sorting;

import java.util.Scanner;

public class BubbleSort1 
{
   public static void Printarray(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] BubbleSort(int[] num)
	{
		int c=0;
		for(int i=0;i<=num.length-1;i++)
		{
			boolean b=false;
			for(int j=0;j<=num.length-2;j++)
			{
				c++;
				
				if(num[j]>num[j+1])
				{
					b=true;
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		System.out.println(c);
		
		 Printarray(num);
		return num;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n= sc.nextInt();
		int[] num=new int[n];
		System.out.println("Enter int element");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
		BubbleSort(num);

}
}
