package String;

public class KeySearch 
{
  public static boolean startsWith(String str,String key)
  {
	  if(key.length()<=str.length() && str.substring(0,key.length()).equals(key))
	  {
		  return true;
	  }
	  return false;
  }
  public static void main(String[] args) 
  {
	String str="jhifwefhwe khdh";
	System.out.println(startsWith(str,"jhi"));
}
	

}
