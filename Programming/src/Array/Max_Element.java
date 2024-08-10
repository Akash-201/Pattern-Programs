package Array;

public class Max_Element
{

	 public static int print(int[] num)
	  {
		 int max=num[0];
		  for(int i=1;i<=num.length-1;i++)
		  {
			if(num[i]>max)
			{
				max=num[i];
			}
		  }
		  return max;
	  }
	  public static void main(String[] args) 
	  {
		  int[] num= {1, 2, 3, 4, 3, 6,11, 4, 9,1};
		 System.out.println(print(num)); 
		  
	}

}
