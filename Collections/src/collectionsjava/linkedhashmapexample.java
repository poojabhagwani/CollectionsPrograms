package collectionsjava;

import java.util.*;

public class linkedhashmapexample {
	
	public static void main(String[] args)
	{
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer,String>();
		hm.put(1, "Pooja");
		hm.put(6, "Harshit");
		hm.put(2, "dev");
		hm.put(4, "Elesa");
		
		for(Map.Entry m:hm.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		
	}

}
