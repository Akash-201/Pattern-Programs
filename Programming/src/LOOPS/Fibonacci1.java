package LOOPS;

//nth fibonacci number


public class Fibonacci1 
{
  public static void print(int n)
  {
	  int a=0;
	  int b=1;
	  for(int i=0;i<n;i++)
	  {
		  int c=a+b;
		  a=b;
		  b=c;

	  }
	  System.out.print(a+" ");
    }
  public static void main(String[] args)
  {
	print(10);
}
	
}
