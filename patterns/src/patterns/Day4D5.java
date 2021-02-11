package patterns;

import java.util.Scanner;

public class Day4D5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		//1
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
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			
			//4
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//line
			//5
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//line
		for(int i=0;i<=0;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//2
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//line
			for(int j=0;j<=0;j++)
			{
				System.out.print("*");
			}
			//2
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			//3
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			//4
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			//5
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//line
		for(int i=0;i<=0;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		//3
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
		
			//2
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			//4
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			//5
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			//line
			for(int j=0;j<=0;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//line
		for(int i=0;i<=0;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//4
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			//2
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			//3
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			//4
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
		
			//5
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
