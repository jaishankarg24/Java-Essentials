package collect_obj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchPrint 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		System.out.println("-------------------");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i)+" ");
			
		}
		
		System.out.println();
		
		System.out.println("*************************");
		
		Iterator itr=al.iterator();
		while(itr.hasNext()==true)
		{
			System.out.println(itr.next());
		
		}
		System.out.println("/////////////////////////////");
		
		ListIterator litr=al.listIterator();
				while(litr.hasNext()==true)
				{
					System.out.println(litr.next());
				}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		
		for(Object x:al)
		{
			System.out.println(x);
		}
		
		// TODO Auto-generated method stub

	}

}
