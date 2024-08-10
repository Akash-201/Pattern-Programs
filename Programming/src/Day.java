import java.util.Scanner;

public class Day 
{
public static void check(int n)
{
	switch(n)
	{
	case 0:System.out.println("Day is sunday");
	break;
	case 1:System.out.println("Day is monday");
	break;
	case 2:System.out.println("Day is tuesday");
	break;
	case 3:System.out.println("Day is wednesday");
	break;
	case 4:System.out.println("Day is thrusday");
	break;
	case 5:System.out.println("Day is friday");
	break;
	case 6:System.out.println("Day is saturday");
	break;
	default:System.out.println("invalid input");
	
	}
}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	
	check(n);
    sc.close();
	
	}
	

}
