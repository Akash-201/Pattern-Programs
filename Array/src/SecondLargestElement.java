
public class SecondLargestElement 
{
 
	public static void print(int[] num)
	{
		int temp;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("2nd Largest element is : "+num[1]);
	}
	public static void main(String[] args)
	{
		int[] num= {1,3,8,6,7,9};
		print(num);
	}
	
	
	
}
