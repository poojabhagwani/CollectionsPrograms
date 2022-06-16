package collectionsjava;

import java.util.*;

public class treemapexample {
	
	public static void main(String[] args)
	{
		TreeMap<Integer, String> hm = new TreeMap<Integer,String>();
		hm.put(1, "Pooja");
		hm.put(6, "Harshit");
		hm.put(2, "dev");
		hm.put(4, "Elesa");
		
		for(Map.Entry m:hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
	}

}
