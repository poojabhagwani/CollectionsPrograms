package collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(8);
		array.add(9);
		Iterator i = array.iterator();
		System.out.println("Before Reversal");
		while(i.hasNext())
			System.out.println(i.next());
		Collections.reverse(array);
		System.out.println("After Reversal");
		Iterator i2 = array.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
	}

}
