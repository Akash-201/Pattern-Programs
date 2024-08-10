package String;

public class Palindrom_Array_List
{

	public static void print(String[] s)
	{
		for(int i=0;i<=s.length-1;i++)
		{
			if(check(s[i]))
			{
			System.out.print(s[i]+" ");	
			}
		}
	}
	
    public static boolean check(String str)
   {
    	
	  String res="";
	  for(int i=0;i<=str.length()-1;i++)
	  {
		  res=str.charAt(i)+res;
	  }
	
	  if(str.equals(res))
	  {
		  return true;
	  }
	  return false;
   }
   public static void main(String[] args) 
	{
		
		String[] s= {"hello","aba","madam","abc"};
		print(s);
	}
	

}
