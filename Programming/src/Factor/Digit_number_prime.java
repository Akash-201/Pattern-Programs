package Factor;
// first 5 three digit prime number or 2 digit so on
public class Digit_number_prime
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
	public static void printNprime(int start,int num)
	{
		int p=0;
		for(int i=start;;i++)
		{
			if(Checkprime(i))
			{
				System.out.print(i+" ");
				p++;
			}
			if(p==num)
			{
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		printNprime(100,5);
	}
		

	}
	


