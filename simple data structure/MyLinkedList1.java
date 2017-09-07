

public class MyLinkedList1<E>{
	private static final class Node<E> {
		private E data; //data holder for the node
		private Node<E> next; //link to the next node
		private Node<E> previous; //link to the previous node

		public Node(E data) { 
			this.data = data;
			this.next = null;
		}
	
		public int size() {
			return size;
		}
	
		//size of the list
		private int size = 0;
		//head node in the list (e.g. first node) 
		private Node<E> head = null;
		//last node in the list
		private Node<E> last = null;

		//add a new node to end of the list
		public boolean add(E data) {
			Node<E> newNode = new Node<E>(data);

			if (size == 0)//list was empty and we are adding a new list
				head = last = newNode;
			else { //list is not empty and we are adding to the end of the list
				newNode.previous = last;
				last.next = newNode;
				last = newNode;
			}
			size++;
			
			return true;
		}
		
		public void removeNode(Node<E> e) {	
			size--;//Since we assume e is in the list
			
			if (size == 0)
				head = last = null; //e was the only element and now removed
			else {
				if (e == head) { //e was the head and now removed
					head = e.next;
					e.next.previous = null;
				} else if (e == last) { //e was the last node and now removed
					last = e.previous;
					e.previous.next = null;
				} else { //e was in the middle of the list and now removed
					e.next.previous = e.previous;
					e.previous.next = e.next;
				}
			}
		}

	}}