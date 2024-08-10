package LOOPS;

public class Print1
{
public static void  print(int n)
{
	int x=10;
	int y=5;
	for(int i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			System.out.print(x+" ");
			x=x+50;
		}
		else
		{
			System.out.print(y+" ");
			y=y+10;
		}
	}
}
public static void main(String[] args) 
{
print(10);	
}
	

}
