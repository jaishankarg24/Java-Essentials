package resource;

class Bathroom implements Runnable
{

	@Override
	 public void run() {
		Thread t=Thread.currentThread();
		try
		{
			System.out.println(t.getName()+ "has entered the bathroom");
			Thread.sleep(5000);
			
			System.out.println(t.getName()+ "is using the bathroom");
			Thread.sleep(5000);
			
			System.out.println(t.getName()+ "has left the bathroom");
			Thread.sleep(5000);
			
		}
		
		catch(Exception e)
		{
			System.out.println("some problem");
		}
		// TODO Auto-generated method stub
		
	}
	
}

public class LaunchBathroom 
{

	public static void main(String[] args) throws InterruptedException
	{
		Bathroom b=new Bathroom();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Others");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	
		// TODO Auto-generated method stub

	}

}
