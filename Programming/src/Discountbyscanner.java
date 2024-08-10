import java.util.Scanner;


public class Discountbyscanner
{
public static float display(int n)
{
	float amt=n*100;
	if(amt>=1000)
	{
		return amt-(amt*10.0f/100.0f);
	}
	else
	{
		return amt;
	}
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter quantity");
	int n=sc.nextInt();
	
	System.out.println("total amount ="+display(n));
	sc.close();
	
	}
	}
