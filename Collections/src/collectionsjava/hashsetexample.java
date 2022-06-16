package collectionsjava;

import java.util.*;

public class hashsetexample {
	
	public static void main(String[] args)
	{
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("Ravi");
	hs.add("Shankar");
	hs.add("Aarav");
	hs.add("Saqib");
	
	Iterator<String> itr=hs.iterator();
	
	while(itr.hasNext())
		System.out.println(itr.next());
	}

}
