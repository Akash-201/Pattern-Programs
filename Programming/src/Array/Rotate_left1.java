package Array;

public class Rotate_left1
{
	
		public static void Print(int[] num) {
			for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
			}
		}
		
	  public static int[] rotate(int[] num)
	  {
		  int first=num[0];  // 1st step5
		  for(int i=0;i<=num.length-2;i++) //step 2
		  {
			  num[i]=num[i+1];
		  }
		  num[num.length-1]=first; // step 3
		     Print(num);
		  return num;
	  }
	  public static void main(String[] args) 
	  {
       int[] x= {1,2,3,4,5};
       Print(x);
       System.out.println();
      rotate(x);
     
      }
}
