package com.fiverr.mule.integration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PayloadService {
	
	public LinkedHashMap<String,String>  processPayload(HashMap<String,List<LinkedHashMap<String,String>>> payload){
		
	 	for(Map.Entry entryset : payload.entrySet()){
			
			String key = (String) entryset.getKey();
			String value = entryset.getValue().toString();
			System.out.println(" key " + key + " value " + value);
		}
		
		return payload.get("data").get(0);
	}
	
	/*public String processPayload(HashMap<String,String> name){
		System.out.println(" hello " + name);
		return "hi";
	}*/

}
