package collectionframework;
import java.util.*;
public class hashmap {

	public static void main(String[] args) {
		 // Create a hash map
	      HashMap<String,Double> hm = new HashMap<String,Double>();
	      
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
	      // Get a set of the entries
	      Set<Map.Entry<String,Double>> set = hm.entrySet();
	      
	      // Get an iterator
	      Iterator<Map.Entry<String,Double>> i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry<String,Double> me = (Map.Entry<String,Double>)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      
	      // Deposit 1000 into Zara's account
	      double balance = hm.get("Zara").doubleValue();
	      hm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " + hm.get("Zara"));
	      
	      hashmethod();
	}
	
	private static void hashmethod(){
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "one");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(2, "two");
		map.put(4, "four");
		
		for(Map.Entry<Integer,String> entry: map.entrySet()){
			int key=entry.getKey();
			String text=entry.getValue();
			System.out.println(key + " "+ text);
		}
	}

}
