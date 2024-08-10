package LOOPS;

public class Print100evenno {
	
	public static void Print() {
		System.out.println("First 100 Even Numbers are : ");
		int count=1;
		for(int i=1;count<=100;i++) {
			if(i%2==0) {
				System.out.print(count+" ");
				
			}
			count++;
		}
		System.out.println();
	}
	
	public static void Print(int n) {
		System.out.println("First "+n+" Even Numbers are : ");
		int count=1;
		for(int i=1;count<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Print(100);
		Print(20);
	}

}

