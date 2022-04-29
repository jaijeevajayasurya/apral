package org.Override;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Night {
public static void main(String[] args) {
	Map<Integer,String> m = new LinkedHashMap(); 
	m.put(1, "a");
	m.put(2, "b");
	m.put(3, "c");
	System.out.println(m);
	int size = m.size();
	System.out.println(size);
	Collection<String> values = m.values();
	System.out.println("value of map"+values);
	for (String h : values) {
		System.out.println(h);
	}
	//Set<Integer> entry = m.keySet();
	//System.out.println("map key"+ entry);
	//for (Integer key : entry) {
		//System.out.println(key);
	//}
	
	}
	}


