package collectionframework;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		
		 LinkedList<String> ll = new LinkedList<String>();	      
	      // add elements to the linked list
	      ll.add("F");
	      ll.add("B");
	      ll.add("D");
	      ll.add("E");
	      ll.add("C");
	      ll.addLast("Z");
	      ll.addFirst("A");
	      ll.add(1, "A2");
	      System.out.println("Original contents of ll: " + ll);

	      // remove elements from the linked list
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Contents of ll after deletion: " + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: " + ll);

	      // get and set a value
	      Object val = ll.get(0);
	      ll.set(2, (String) val + "Changed");
	      System.out.println("ll after change: " + ll);
	      
	      List<Integer> arraylist=new ArrayList<Integer>();
	      List<Integer> linkedlist=new ArrayList<Integer>();
	      
	      doTiming("array",arraylist);
	      doTiming("link",linkedlist);
	      	      
	}
	private static void doTiming(String type,List<Integer> list){
		
		
		for(int i=0;i<1E5;i++){
			list.add(i);
		}
		long start=System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++){
			list.add(0,i);
		}
		long end=System.currentTimeMillis();
		
		System.out.println("time taken"+(end-start) +"ms for"+ type);
	}

}
