package LOOPS;

public class NegativePositive
{
public static void print(int n)
{
	int x=-1;
	int y=4;
	int d=6;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			
			System.out.print(y+" ");
			y=y+d;
		}
		else
		{
			System.out.print(x+" ");
			x=x-d;
		}
	}
}
public static void main(String[] args) 
{
	print(10);
}
	

}
