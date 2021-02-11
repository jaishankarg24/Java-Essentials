package multi_thread;

import java.util.Scanner;

class Banking extends Thread
{
	public void run()
	{
		System.out.println("Banking started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter acc no");
		int ac =scan.nextInt();
		System.out.println("Enter password");
		int pw=scan.nextInt();
		System.out.println("collect money");
		System.out.println("Banking completed");
	}
}

class Printing extends Thread
{
	public void run()
	{
		System.out.println("Printing started");
		for(int i=1;i<=5;i++)
		try
		{
			System.out.println("ABC");
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println("some problem");	
		}
		System.out.println("Printing completed");	
	}
}

class Addition extends Thread
{
	public void run()
	{
		System.out.println("Addition started");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("addtion completed");
	}
}


public class LaunchThread
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		Banking b=new Banking();
		Printing p=new Printing();
		Addition ad=new Addition();
		
		b.setName("BANK");
		p.setName("PRINT");
		ad.setName("ADD");
		
		b.start();
		p.start();
		ad.start();
		System.out.println("main completed");
		
		// TODO Auto-generated method stub

	}

}
