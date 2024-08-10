package Array;

public class Rotate_Right 
{
public static void print(int[] num)
{
	for(int i=0;i<num.length;i++)
	{
		System.out.print(num[i]+" ");
	}
}
public static int[] rotate(int[] num )
{
	int last=num[num.length-1];
	for(int i=num.length-1;i>0;i--)
	{
		num[i]=num[i-1];
	}
	num[0]=last;
	print(num);
	return num;
}
public static void main(String[] args)
{
	int[] x= {1,2,3,4,5};
	print(x);
	System.out.println();
	rotate(x);
}
	
}
