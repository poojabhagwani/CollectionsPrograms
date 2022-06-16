package collectionsjava;

import java.util.*;

public class linkedhashsetexample {
		
		public static void main(String[] args)
		{
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Ravi");
		hs.add("Shankar");
		hs.add("Aarav");
		hs.add("Saqib");
		
		Iterator<String> itr=hs.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		}

}
