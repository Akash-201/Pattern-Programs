package Searching;

public class Binary
{
public static int search(int[] num,int key)
{
	int l=0;
	int h=num.length-1;
	while(l<=h)
	{
		int mid=(l+h)/2;
		if(num[mid]==key)
		{
			return mid;
		}
		else if(num[mid]>key)
		{
			h=mid-1;
		}
		else
		{
			l=mid+1;
		}
	}
	return -1;
}
public static void main(String[] args)
{
	int[] num= {1,2,4,5,7,8,9};
	System.out.println(search(num,9));
}
	

}
