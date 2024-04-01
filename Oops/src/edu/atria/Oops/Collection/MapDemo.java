package edu.atria.Oops.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map map = new HashMap();
		map.put("First", "1St");
		map.put("2 nd",new Float(2.0f));
		map.put("third", "3 rd");
		
		//duplication overrides the previous assignment
		map.put("third", 3);
		System.out.println("Entries of map"+map);
		 
		//to view the map
		//Return the set view of keys
		Set set = map.keySet();
		System.out.println("The keys are"+set);
		//Return the collection view of value
		Collection collection = map.values();
		//Return the set view of key value mapping
		Set mapset = map.entrySet();
		System.out.println(set+"\n"+collection+"\n"+mapset);
		
	}

}
