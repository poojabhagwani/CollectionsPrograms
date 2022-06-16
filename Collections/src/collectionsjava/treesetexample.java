package collectionsjava;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetexample {
	
	public static void main(String[] args)
	{
	
	TreeSet<String> hs = new TreeSet<String>();
	hs.add("Ravi");
	hs.add("Shankar");
	hs.add("Aarav");
	hs.add("Saqib");
	hs.add("Ravi");
	
	Iterator<String> itr=hs.iterator();
	
	while(itr.hasNext())
		System.out.println(itr.next());
	}


}
