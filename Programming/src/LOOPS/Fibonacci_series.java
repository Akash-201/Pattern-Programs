package LOOPS;

//n fibonacci number

public class Fibonacci_series 
{
public static void print(int n)
{
//	int n1=0;
//	int n2=1;
//	System.out.print(n1+" "+n2);
//	for(int i=1;i<=n-2;i++)
//	{
//		int n3=n1+n2;
//		System.out.print(" "+n3);
//		n1=n2;
//		n2=n3;
//	}
	int a=0;
	int b=1;
	for(int i=0;i<n;i++)
	{
		System.out.print(a+" ");
		int c=a+b;
		a=b;
		b=c;
		
	}
}
public static void main(String[] args) 
{
	print(10);
}
	

}
