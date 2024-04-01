
import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack<Integer> s = new Stack<Integer>();
		 System.out.println("Pushing the elements into the Stack");
		 s.push(6);
		 s.push(4);
		 s.push(5);
		 s.push(0);
		 System.out.println(s);
		 System.out.println("Removing a last element "+s.pop());
		 System.out.println("After removable"+s);
		 System.out.println("Search an element "+s.search(5));
		 System.out.println("Search an element "+s.search(6));
		 System.out.println("Search an element "+s.search(8));
		 System.out.println("Search an element "+s.search(9));
	     System.out.println("Search an element "+s.search(4));
	      System.out.println("The peek elements "+s.peek());
	       System.out.println(s);
	}

}
