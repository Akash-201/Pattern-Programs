package Array;

public class Reverse_An_Array 
{
 public static int[] Reverse(int[] num)
 {
	

	 int j=num.length-1;
	 for(int i=0;i<=(num.length-1)/2;i++)
	 {
		 int temp=num[i];
		 num[i]=num[j];
		 num[j]=temp;
		 j--;
		
	 }
     Print(num);
	 return num;
	

 }
 public static void Print(int[] nums) {
	 for(int i=0;i<nums.length;i++) {
		 System.out.print(nums[i]+" ");
	 }
	 System.out.println();
 }
 public static void main(String[] args) 
 {
	int[] num= {1,2,3,4,5,6,7};
	Reverse(num);
//	Print(num);
//	Print(Reverse(num));
}
	

}
