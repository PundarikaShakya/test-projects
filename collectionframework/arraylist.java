package collectionframework;
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		
		      // create an array list
		      ArrayList<String> al = new ArrayList<String>();
		      System.out.println("Initial size of al: " + al.size());
		      // add elements to the array list
		      al.add("C");
		      al.add("A");
		      al.add("E");
		      al.add("B");
		      al.add("D");
		      al.add("F");
		      al.add(0, "aaa");
		      System.out.println("Size of al after additions: " + al.size());
		      System.out.println(al);
		      // display the array list
		      System.out.println("Contents of al: " + al);
		      // Remove elements from the array list
		      al.remove("F");
		      al.remove(2);
		      System.out.println("Size of al after deletions: " + al.size());
		      System.out.println("Contents of al: " + al);
		      System.out.println("iteration");
		      for(String value:al){
			    	System.out.println(value);
			    }
		   }
		
	}


