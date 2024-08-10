
public class KthSmallestElement 
{

	public static void print(int[] num,int k)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"th smallest element is : "+num[i]);
				break;
			}
		}
	}
	public static void main(String[] args)
	{
	int[] num= {2,4,1,6,5,9,0,3};
	print(num, 5);
	}
}
