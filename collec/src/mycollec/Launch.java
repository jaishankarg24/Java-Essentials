package mycollec;
import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) {
		
				ArrayList al=new ArrayList();
				al.add(10);
				al.add(20);
				al.add(30);
				System.out.println(al);
				
				ArrayList al2=new ArrayList();
				al2.add(99);
				al2.add(999);
				al2.add(9999);
				 
				//al.addAll(al2);
				//System.out.println(al);
				
				//al.addAll(2, al2);
				//System.out.println(al);

				System.out.println(al.contains(300));
				al.addAll(al2);
				System.out.println(al.containsAll(al2));
				
				System.out.println(al);
				System.out.println(al.get(5));
				System.out.println(al.indexOf(30));
				System.out.println(al.lastIndexOf(10));
				System.out.println(al.size());
				System.out.println(al.remove(4));
				System.out.println(al);
				
				//al.removeAll(al2);
				System.out.println(al);
				
				al.retainAll(al2);
				System.out.println(al);
				
				
				
				
				
				
			}


	}

