package Array;

public class Duplicate_Element 
{
	public static void print(int num[],int n) {
		boolean b=false;
		int [] hash=new int[n];
		for(int i=0;i<=n-1;i++) {
			hash[num[i]]++;
		}
		for(int i=0;i<=hash.length-1;i++) {
//			if(hash[i]>1) // print duplicate(1)
//			if(hash[i]==1)//print unique(2)
//			if(hash[i]>=1) // remove duplicate(3)	
			if(hash[i]>=1) // print frequently of each element(4)
			{
				b=true;
			//	System.out.println(i+" "); // 1,2,3
				System.out.println(i+"----->"+hash[i]); //(4)
			}
		}
		if(b==false) {
			System.out.println(-1);
		}
		//System.out.println(Array.toString(hash));
	}
	public static void main(String[] args) {
		int num[]= {1,2,3,1,1,2,5,3,7,9,1};
		print(num,num.length);

	}
	

}
