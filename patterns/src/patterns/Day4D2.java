package patterns;

import java.util.Scanner;

public class Day4D2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			//2
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("*");
			}
			//4
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//5
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//6
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			//7
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("*");
			}
			//8
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//9
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//10
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			//11
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("*");
			}
		// TODO Auto-generated method stub
			System.out.println();
		}
	}

}
