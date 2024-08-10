package LOOPS;

public class ThirteenDifference 
{
public static void print(int n)
{
//	int x=2;
//	int d=13;
//	for(int i=1;i<=n;i++)
//	{
//		System.out.println(x+" ");
//		x=x+d;
//		d=d+13;
//	}
int x=2;
int d=13;
for (int i=1;i<=n;i++)
{
	System.out.print(x+" ");
	x=x+d*i;
}
	
	}
	
public static void main(String[] args) 
{
	print(10);
}
	

}
