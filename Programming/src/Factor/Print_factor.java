//print factor of a given number

package Factor;


public class Print_factor
{
public static void print(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.print(i+" ");
		}
	}
}
public static void main(String[] args) 
{
	print(20);
}
	

}
