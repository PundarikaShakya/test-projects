package collectionframework;
import java.util.*;
public class sortedset {

	public static void main(String[] args) {
		// Create the sorted set
	      SortedSet<String> set = new TreeSet<String>(); 

	      // Add elements to the set
	      set.add("2ad");
	      set.add("ac");
	      set.add("3aa");

	      // Iterating over the elements in the set
	      Iterator<String> it = set.iterator();

	      while (it.hasNext()) {
	         // Get element
	         Object element = it.next();
	         System.out.println(element.toString());
	      }
	      System.out.println(set.last());

	}

}
