package test;

public class LinkedListLength {

	public static int length(Node a) {

		int count = 0;
		while (a != null) {
			count++;
			a = a.next;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Node a=new Node(2);
		Node b=new Node(6);
		Node c=new Node(9);
		Node d=new Node(3);
		Node e=new Node(1);
		Node f=new Node(2);


		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		
		System.out.println("Length is: "+length(a));	
		
		}
}