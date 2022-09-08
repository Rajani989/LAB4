
//Program of Hash Map whose keys are 1 to 15 and its value square of keys.

package projectLab4;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapQuestion {             //Class HashMapQuestion

	public static void main(String... args) {             //Main method
		// TODO Auto-generated method stub
      HashMap<Integer,Integer> map=new HashMap<>();       //HashMap declaration
      for(int i=1;i<=15;i++)                                        //Loop from 1 to 15
      {
    	  map.put(i, i*i);
    	         //print key and value
    	 
      }//end of loop
      
      

		System.out.println("Printing keys and values of Hashmap...");  
		
		   for(Entry<Integer, Integer> m : map.entrySet())
		   {    
			   System.out.println("KEY: "+m.getKey()+" VALUES"
			   		+ " : "+m.getValue());    
		   }  	
	}//end of main method

}//end of program
