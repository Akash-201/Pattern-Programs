package String;

public class KeySearch1 
{

	  public static boolean endWith(String str,String key)
	  {
		  if(key.length()<=str.length() && str.substring(str.length()-key.length()).equals(key))
		  {
			  return true;
		  }
		  return false;
	  }
	  public static void main(String[] args) 
	  {
		String str="hello";
		System.out.println(endWith(str,"llo"));
	}

}
