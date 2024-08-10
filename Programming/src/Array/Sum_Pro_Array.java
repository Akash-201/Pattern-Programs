package Array;

public class Sum_Pro_Array 
{
public static void print(int[] x)
{
	int sum=0;
	int product=1;
	for(int i=0;i<=x.length-1;i++)
	{
		sum=sum+x[i];
		product=product*x[i];
	}
	System.out.println("sum is : "+sum);
	System.out.println("product is : "+product);
}
public static void main(String[] args) 
{
	int[] x= {1,2,3,4};
	print(x);
}
	

}
