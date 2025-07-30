package test;

public class Node {
//	value
	int data;
//adderss of next
	Node next;

	Node(int data) {
		this.data = data;
	}

	public static void main(String[] arr) throws Exception {

		Node a = new Node(5);
		Node b = new Node(1);
		Node c = new Node(4);
		Node d = new Node(6);
		Node e = new Node(7);

		System.out.println(a.next);
		System.out.println(a.data);
		System.out.println(a);
		System.out.println();

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;

//	System.out.println(a.next);
//	System.out.println(b);
//	System.out.println(b.next);
//	System.out.println(c);
//	System.out.println(d.next);

//		System.out.print(a.data + " ");
//		System.out.print(a.next.data + " ");
//		System.out.print(a.next.next.data + " ");
//		System.out.print(a.next.next.next.data + " ");
//		System.out.print(a.next.next.next.next.data + " ");
//		System.out.println();

//		Node temp = a;
//		for (int i = 1; i <= 5; i++) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//    Better method to print linkedlist.

		Node temp=a;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}