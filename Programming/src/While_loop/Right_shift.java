package While_loop;

import java.util.Scanner;

public class Right_shift
{
	

	
		//Program to count digits
		public static int countDig(int n) {
			int count=0;
			
			while(n>0) {
				
				n=n/10;
				count++;

			}
			return count;
			
		}

		//Shift N times
		public static void ShiftN(int num, int n) {
			System.out.println(num+" right shift results : ");
			int temp;
			int res=num;
			int p=countDig(num);
			while(n>0) {
				num=res;
				temp=num%10;
				num=num/10;
				res=(int) (temp*Math.pow(10, p-1)+num);
				System.out.print(res+" ");
				n--;
			}
			System.out.println("\n");
			
			
		}
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			while(true) {
				System.out.println("Enter the number you want to shift : ");
				int num=sc.nextInt();
				System.out.println("Enter how many times you want to shift :");
				int n=sc.nextInt();	
				ShiftN(num,n);
			}
			
		}
	}
	


