package LOOPS;

public class Tribnocci_series
{
public static void print(int n)
{
	int a=0;
	int b=1;
	int c=1;
	for(int i=1;i<=n;i++)
	{
		System.out.print(a+" ");
		int d=a+b+c;
		a=b;
		b=c;
		c=d;
	}
}
public static void main(String[] args) 
{
	print(10);
}
}
