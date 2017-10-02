import java.util.HashMap;
import java.util.Map;

class BagHM 
{      
// the items in the bag, and their number of occurences
      private Map<String, Integer> map = new HashMap<String, Integer>();    
      		  
	  void add(String w)
	  {//   add w to bag
	       if (map.containsKey(w)) 
		   {
			    Integer freq = map.get(w);
				freq = freq + 1;
				map.put(w, freq);
				// map.put(w, map.get(w)+1);  
				// all 3 lines above on the one line           
           }
		   else 
		   {
		        map.put(w, 1); //first occurrence of word
           }
       }
		  

      int frequency (String w)
      {   
		  if (map.containsKey(w)) 
		  {
			   return map.get(w);
		  }
		  else 
		  {         		
			   return 0;
	      } 
	  }
	  

	  boolean removeAll(String w)
      {
          // remove All occurrence of w if there is at least one, 
		  // and return true otherwise return false.
		  if (map.containsKey(w)) 
		  {   
			  map.remove(w);
          	  return true; 
		  } 
		  else
		  { 
			  return false;
		  }
      }

      boolean remove(String w)
      {
          // remove ONE occurrence of w if there is at least one, and return true;
          // otherwise return false.
		  if (map.containsKey(w)) 
		  {
			 Integer freq = map.get(w);
			 freq = freq - 1;
		     map.put(w, freq);
             // map.put(w, map.get(w)-1);  //  all 3 lines above on the one line     
      		 return true;
		  }
		  else  
		  {         		
				return false;
		  }
      }
}