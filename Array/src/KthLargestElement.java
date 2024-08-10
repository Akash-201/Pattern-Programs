
public class KthLargestElement
{
 public static void print(int[] num,int k)
 {
	 for(int i=0;i<num.length;i++)
	 {
		 for(int j=i+1;j<num.length;j++)
		 {
			if(num[i]<num[j])
			{
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		 }
		 if(i==k-1)
		 {
			 System.out.println(k+ "th Largest element is : "+num[i]);
			break; 
		 }
	 }
	 
 }
 public static void main(String[] args) 
 {
int[] num= {3,5,4,8,7,9};
print(num, 4);

}
}
