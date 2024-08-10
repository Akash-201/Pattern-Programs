package While_loop;

public class Check_Fibonic 
{
  public static boolean check(int n)
  {
	  int a=0;
	  int b=1;
	  while(a<=n)
	  {
		  int c=a+b;
		  if(n==a)
		  {
			  return true;
		  }
		  a=b;
		  b=c;
	  }
	  return false;
  }
  public static void main(String[] args) 
  {
	System.out.println(check(14));
  }
	

}
