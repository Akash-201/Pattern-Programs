package Array;

public class Print_Array 
{
public static void printarr(int[] num)
{
//	for(int i=0;i<=num.length-1;i++)
//	{
//		System.out.print(num[i]+" ");
//	}
	
	//------------(while loop)------------------------------------------------
//	int i=0;
//	while(i<=num.length-1) 
//	{
//		System.out.print(num[i]+" ");
//		i++;
//	}
	//---------(do while loop)----------------------------------------------------
//	int i=0;
//	do
//	{
//		System.out.print(num[i]+" ");
//	i++;
//	}
//	while(i<=num.length-1);
	//-------------------(for each loop)---------------------------------------------
	for(int n:num)
	{
		System.out.print(n+" ");
	}
		
}
public static void main(String[] args)
{
	int[] num= {1,2,3,4,5,6};
	printarr(num);
	

}
}
