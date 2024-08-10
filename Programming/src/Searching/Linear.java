package Searching;

public class Linear
{
	public static boolean search(int[] num,int key)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]==key) 
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
    int[] num= {1,2,3,4,5,6 ,9,7};
    System.out.println(search(num,8)); 
   
	

     }
	}
