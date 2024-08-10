package Sorting;

public class SelectionSort1 
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
		
		for(int i=0;i<=num.length-2;i++)
		{
			int small=i;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[small]>num[j])
				{
					small=j;
				}
			}
			int temp=num[i];
			num[i]=num[small];
			num[small]=temp;
		}
		 Printarray(num);
		return num;
	}
	
	public static void main(String[] args) 
	{
	int[] x= {2,5,1,3,2,4,1,7};
     Printarray(x);
	
	sort(x);
	}

}
