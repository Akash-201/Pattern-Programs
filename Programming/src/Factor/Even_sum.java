// sum of even factor

package Factor;

public class Even_sum 
{
public static void print(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0 && i%2==0)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
	}
	System.out.println("\nsum is - "+sum);
	
}
public static void main(String[] args) 
{
	print(20);
}
	

}


