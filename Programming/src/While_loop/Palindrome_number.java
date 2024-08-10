package While_loop;

public class Palindrome_number 
{
	

		public static boolean check(int n)
		{
			int rev=0;
			int temp=n;
			while(n>0)
			{
				int rem=n%10;
		
				rev=rev*10+rem;
				
				n=n/10;
				
			}
		
	         	
		
		if(rev==temp)
		{
			return true;
		}
		return false;
	
}
		public static void main(String[] args) 
		{
			System.out.println(check(121));
		}
}

