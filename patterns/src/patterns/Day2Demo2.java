package patterns;

import java.util.Scanner;

public class Day2Demo2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i==j || i+j==n-1 
						|| i+j==n/2 || i-j==n/2 ||j-1==n/2 ||
						i+j==(n+n/2-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
