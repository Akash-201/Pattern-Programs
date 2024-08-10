package While_loop;

public class LuckyInRange {

	public static int add(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
		
	}
	public static boolean checkLucky(int n)
	{
		int sum=add(n);
		while(sum>9)
		{
			sum=add(sum);
		}
		if(sum==1)
		{
			return true;
		}
		return false;
				
	}
	public static void printLucky(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			if(checkLucky(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		printLucky(10,99);
	}

}
