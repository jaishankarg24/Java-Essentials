package patterns;

import java.util.Scanner;

public class Day3D5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				{
					System.out.print("*");
				
				}
			for(int j=0;j<n;j++)
			{
				System.out.print("$");
			
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("@");
			
			}
		
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}

}
