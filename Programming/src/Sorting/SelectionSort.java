package Sorting;

public class SelectionSort
{
	public static void Printarray(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] sort(int[] num)
	{
		int c=0; // for count number of loop execution
		for(int i=0;i<=num.length-2;i++)
		{
			for(int j=i+1;j<=num.length-1;j++)
			{
				c++;
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(c);
		 Printarray(num);
		return num;
	}
	
	public static void main(String[] args) 
	{
	int[] x= {2,5,1,3,2};
     Printarray(x);
	sort(x);
	}

}
