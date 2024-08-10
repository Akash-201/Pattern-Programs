package Array;

public class Second_half
{
public static void print(int[] x)
{
	for(int i=x.length/2;i<=x.length-1;i++)
	{
		System.out.print(x[i]+" ");
	}
}
public static void main(String[] args) 
{
int[] x= {1,2,3,4,5,6,7};
print(x);
}
	

}
