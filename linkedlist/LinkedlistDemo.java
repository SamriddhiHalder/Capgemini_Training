package linkedlist;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		LinkedList<Person> ll=new LinkedList();
		ll.add(new Person(1,"Sam"));
		ll.add(new Person(2, "Rio"));
		ll.add(new Person(3,"Sappy"));
		ll.add(new Person(4,"Shuv"));
		ll.add(new Person(5,"Sup"));
		ll.add(new Person(6,"Soum"));
		
		Collections.sort(ll);
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(3));
		
		ll.add(new Person(7,"shrey"));
		System.out.println(ll);
		ll.push(new Person(8, "Candy"));
		System.out.println(ll);
		ll.pop();
		ll.offer(new Person(8, "Candy"));
		System.out.println(ll);
		
		
		
	}

	
	

}
