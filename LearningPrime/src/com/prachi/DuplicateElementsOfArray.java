package com.prachi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class DuplicateElementsOfArray {


	public static void main(String[] args) {
	
	char[] arr={'l','a','s','e','n','z','a','e'};
	    
	    HashMap<Character,Integer> myMap=new HashMap<>();
	    
	    List<Character> dupList=new ArrayList<Character>();
	    
	    for(int i=0;i<arr.length;i++){
	        
	        if(myMap.containsKey(arr[i])) {
	        	myMap.put(arr[i], myMap.get(arr[i])+1);
	            dupList.add(arr[i]);
	        }
	        myMap.put(arr[i],1);
	    }
	    
	    ListIterator<Character> 
                iterator = dupList.listIterator(); 
  
            // Printing the iterated value 
            System.out.println("Dup ListIterator:"); 
            while (iterator.hasNext()) { 
                System.out.println(iterator.next()); 
            } 
	}
}
	
