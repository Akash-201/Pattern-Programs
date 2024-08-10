// check prime or not

package Factor;

public class Check_prime 
{
public static void print(int n)
{
	int c=0;
//	for(int i=1;i<=n;i++)
//	{
//		if(n%i==0)
//		{
//			c++;
//		}
//	}
//	if(c==2)
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			c++;
		}
	}
	if(c==0)
	{
	System.out.println(n+" is a prime number");
	}
	else
	{
		System.out.println(n+" is not a prime number");
	}
	
}
public static void main(String[] args) 
{
	print(20);
}
}
