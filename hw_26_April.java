package HW_Geekster;

import java.util.Stack;

public class hw_26_April {

	
	static Node head;

	public static void main(String[] args) {
		Node listA = new Node(4);
		listA.next = new Node(1);
		listA.next.next = new Node(8);
		listA.next.next.next = new Node(4);
		listA.next.next.next.next = new Node(5);

		display(listA);

		Node listB = new Node(5);
		listB.next = new Node(6);
		listB.next.next = new Node(1);
		listB.next.next.next = new Node(8);
		listB.next.next.next.next = new Node(4);
		listB.next.next.next.next.next = new Node(5);

		display(listB);

		System.out.println(getIntersectionNode(listA, listB));
		
		Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);
		System.out.println(isPalindrome(head1));

	}

	public static void display(Node head) {
		if (head == null) {
			System.out.println("List is empty! ");
		} else {
			Node currNode = head;
			while (currNode != null) {
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			System.out.println("Null");
		}
	}

	public static Node getIntersectionNode(Node headA, Node headB) {
		if (headA == null || headB == null)
			return null;
		Node temp = headA;
		Node temp1 = headB;
		while (temp != temp1) {
			if (temp1 == null)
				temp1 = headA;
			else
				temp1 = temp1.next;
			if (temp == null)
				temp = headB;
			else
				temp = temp.next;

		}
		return temp;
	}

	static boolean isPalindrome(Node head) {

		Node slow = head;
		boolean ispalin = true;
		Stack<Integer> stack = new Stack<Integer>();

		while (slow != null) {
			stack.push(slow.data);
			slow = slow.next;
		}

		while (head != null) {

			int i = stack.pop();
			if (head.data == i) {
				ispalin = true;
			} else {
				ispalin = false;
				break;      
			}
			head = head.next;
		}
		return ispalin;
	}

}
