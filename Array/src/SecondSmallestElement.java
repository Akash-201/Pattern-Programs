
public class SecondSmallestElement
{
	public static void print(int[] num)
	{
		int temp;

		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Second Smallest Element is : "+num[1]);
	}
	public static void main(String[] args) 
	{
		int[] num= {4,2,6,8,1,8,0,5};
		print(num);
	}
}
