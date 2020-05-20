package com.hashmap.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
         
         hashmap.put("Nick", 4789);
         hashmap.put("John", 0606);
         hashmap.put("Misra", 1824);
         hashmap.put("Rachel", 2915);
         hashmap.put("Pheebs", 1007);
         
         Iterator<?> iterator = hashmap.entrySet().iterator();
         
         while(iterator.hasNext()){
        	 @SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry)iterator.next();
        	 Object key = entry.getKey();
        	 Object value = entry.getValue();
        	 System.out.print(""+key+"\t");
        	 System.out.println(""+value);
         }       
	}

}
