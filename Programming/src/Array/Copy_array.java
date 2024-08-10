package Array;

public class Copy_array
{
	public static void Copy(int[] nums)
	{
		
		int[] arr=new int[nums.length];
		System.out.println("new array : ");
		for(int i=0;i<nums.length;i++)
		{
			arr[i]=nums[i];
		//	System.out.print(arr[i]+" ");
			
		}
		Print_Array.printarr(arr);
		
//		System.out.println("New Array: ");
//		for(int n:arr) {
//			System.out.print(n+" ");
//		}
//		System.out.println("\n");
	}
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3,4,5};
	Copy(nums);
	}

	

}
