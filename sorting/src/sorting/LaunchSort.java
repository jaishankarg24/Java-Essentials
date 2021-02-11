package sorting;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class LaunchSort {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(20);
		ad.add(10);
		ad.add(40);
		ad.add(30);
		System.out.println(ad);
		ArrayList al=new ArrayList();
		al.addAll(ad);
		Collections.sort(al);
		ad.clear();
		ad.addAll(al);
		System.out.println(ad);
		
		
		// TODO Auto-generated method stub

	}

}
