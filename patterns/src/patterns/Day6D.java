package patterns;

import java.util.Scanner;

public class Day6D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		int c=1;
	
		for(int i=0;i<n;i++)
		{
			//1
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(c+"\t");
				c++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
