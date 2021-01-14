import java.util.LinkedList;
import java.util.Queue;

public class Queue {
public static void main(String [] args) {
	
	Queue <Integer> a=new LinkedList<>();
	
	for(int i=0; i<11; i++) {
		a.add(i);//enqueue 1,2,3,4,.....,10 for data insertion
	}
	
	System.out.println(a);
	System.out.println("Peek Value   "+a.peek());
	int r=a.remove(); //dequeue 
	System.out.println(a);
	
	//int p=a.peek();
	System.out.println("Peek Value   "+a.peek());
	
	int s= a.size();
	System.out.println("Size of Queue is   "+s);
	//System.out.println("Stack Search value is at: "+a.search(10));
	
	}
}
