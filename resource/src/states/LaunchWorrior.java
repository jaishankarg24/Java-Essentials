package states;

class Worrior extends Thread
{
	String res1="bramastra";
	String res2="sarpastra";
	String res3="pashupatastra";
	
	public void run()
	{
		Thread t=Thread.currentThread();
		try
		{
			if(t.getName().equals("Rama"))
			{
				ramaAccRes();
			}
			else
			{
				ravanaAccRes();
			}
		}
		catch(Exception e)
		{
			System.out.println("Some Problem");
		}
	}
	
	void ramaAccRes()
	{
		try
		{
			synchronized(res1)
			{
				System.out.println("rama acc" +res1);
				Thread.sleep(5000);
				synchronized(res2)
				{
					System.out.println("rama acc" +res2);
					Thread.sleep(5000);
					synchronized(res3)
					{
						System.out.println("rama acc" +res3);
						Thread.sleep(5000);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("problem with rama");
		}
	}
	
	void ravanaAccRes()
	{
		try
		{
			synchronized(res3)
			{
				System.out.println("ravana acc" +res3);
				Thread.sleep(5000);
				synchronized(res2)
				{
					System.out.println("ravana acc" +res2);
					Thread.sleep(5000);
					synchronized(res1)
					{
						System.out.println("ravana acc" +res1);
						Thread.sleep(5000);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("problem with ravana");
		}
	}
}
public class LaunchWorrior 
{

	public static void main(String[] args)
	{
		Worrior w1=new Worrior();
		Worrior w2=new Worrior();
		
		w1.setName("Rama");
		w2.setName("Ranana");
		
		w1.start();
		w2.start();
		
		
		// TODO Auto-generated method stub

	}

}
