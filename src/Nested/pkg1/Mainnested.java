package Nested.pkg1;

class Outer
{
	static int a=10;
	int b=20;
	private static int c=40;
	 class inner
	{
		public void test()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
}
public class Mainnested {
public static void main(String []args)
{
	Outer o1=new Outer();
	Outer.inner il=o1.new inner();
	il.test();
}
}