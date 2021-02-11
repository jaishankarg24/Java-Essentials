package runnableint;

import java.util.Scanner;

class Banking implements Runnable
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

class Printing implements Runnable
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

class Addition implements Runnable
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


public class LaunchRunnable 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("main started");
		Banking b=new Banking();
		Printing p=new Printing();
		Addition ad=new Addition();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(p);
		Thread t3=new Thread(ad);
		
		t1.setName("BANK");
		t2.setName("PRINT");
		t3.setName("ADD");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	
		System.out.println("main completed");
		
		// TODO Auto-generated method stub

	}

}
