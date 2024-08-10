package Factor;

// nth prime number

public class Nth_prime_no
{

	public static boolean Checkprime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void print(int num)
	{ 
		int count=0;
		for(int i=2; ;i++)
		{
			if(Checkprime(i))
			{
				count++;
			}
			if(count==num)
			{
				System.out.println(num+"th prime number is:- "+i);
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
	print(4);	
	}

}
