package Array;

public class Swap_Array
{
	public static void Printarray(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
  public static int[] print(int[] num)
  {

	 for(int i=0;i<num.length;i++)
	 {
		 int temp=num[i];
		 num[i]=num[i+1];
		 num[i+1]=temp;
		 i++;
	 }
	 Printarray(num);
	 return num;
	
  }
  public static void main(String[] args)
  {
	int[] num= {1,2,3,4,5,6};
	Printarray(num);
	print(num);
}
	

}
