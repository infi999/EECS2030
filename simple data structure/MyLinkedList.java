import java.util.Iterator;
import java.util.NoSuchElementException;
@SuppressWarnings("unused")
public class MyLinkedList<T>
{
	
	private Node head;
	private int size;
	
	public MyLinkedList(Account a)
	{
		this.head= null;
		this.size = 0;
	}
	
	public MyLinkedList()
	{
		;
	}
	private static class Node
	{
		public Account data;
		public Node next;
		
		public Node(Account s)
		{
			this.data = s;
			this.next = null;
		}
	}
	
	public void setSize(int i)
	{
		this.size = i;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public void add(Account a)
	{
		if(this.getSize() == 0)
		{
			this.head = new Node(a);
		}
		else
		{
			MyLinkedList.add(a, this.head);
		}
		this.setSize(this.getSize()+1);
	}
	
	public static void add(Account a, Node node)
	{
		if(node.next == null)
		{
			node.next = new Node(a);
		}
		else
		{
			MyLinkedList.add(a, node.next);
		}
	}
	
	public Account get(int index)
	{
		if(index < 0 || index >= this.getSize())
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size); 
		}
		return MyLinkedList.get(index, this.head);
	}
	
	public static Account get(int index, Node node)
	{
		if(index == 0)
		{
			return node.data;
		}
		return MyLinkedList.get(index - 1, node.next);
	}
	
	public void set(int index, Account a)
	{
		if(index < 0 || index >= this.getSize())
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size); 
		}
		MyLinkedList.set(index, a, this.head);
	}
	public static void set(int index, Account a, Node node)
	{
		if(index == 0)
		{
			node.data = a;
		}
		MyLinkedList.set(index - 1, a, node.next);
	}
	
	@Override
	public String toString()
	{
		if(this.size == 0)
		{
			return "[]";
		}
		String s = MyLinkedList.toString(this.head);
		return s;		
	}
	
	public static String toString(Node node)
	{
		if(node.next == null)
		{
			return node.data.toString();
		}
		String s = node.data + "\n";
		return s + MyLinkedList.toString(node.next);
	}
	
	public boolean contains(Account c)
	{
		if (this.size == 0)
		{
			return false;
		}
		return MyLinkedList.contains(c, this.head);
	}
	
	private static boolean contains(Account c, Node node)
	{
		if (node.data.equals(c))
		{
			return true;
		}
		if (node.next == null)
		{
			return false;
		}
		return MyLinkedList.contains(c, node.next);
	}
	
	public int indexOf(Account c)
	{
		if (this.size == 0)
		{
			return -1;
		}
		return MyLinkedList.indexOf(c, this.head);
	}
	
	private static int indexOf(Account c, Node node)
	{
		if (node.data.equals(c))
		{
			return 0;
		}
		if (node.next == null)
		{
			return -1;
		}
		int i = MyLinkedList.indexOf(c, node.next);
		if (i == -1)
		{
			return -1;
		}
		return 1 + i;
	}
	
	public void addFirst(Account a)
	{
		Node newNode = new Node(a);
		newNode.next = this.head;
		this.head = newNode;
		this.size++;
	}
	
	private static void add(int index, Account a, Node prev)
	{
		if (index == 0)
		{
			Node newNode = new Node(a);
			newNode.next = prev.next;
			prev.next = newNode;
			return;
		}
		MyLinkedList.add(index - 1, a, prev.next);
	}
	
	public void add(int index, Account a)
	{
		if (index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
		}
		if (index == 0)
		{
			this.addFirst(a);
		}
		else
		{
			MyLinkedList.add(index - 1, a, this.head);
			this.size++;
		}
	}
	
	public Account removeFirst()
	{
		if (this.size == 0)
		{
			throw new NoSuchElementException("");
		}
		Node curr = this.head;
		this.head = curr.next;
		curr.next = null;
		this.size--;
		return curr.data;
	}
	
	
	private static Account remove(int index, Node prev, Node curr)
	{
		if (index == 0)
		{
			prev.next = curr.next;
			curr.next = null;
			return curr.data;
		}
		return MyLinkedList.remove(index - 1, curr, curr.next);
	}
	
	public Account remove(int index)
	{
		if (index < 0 || index >= this.size)
		{	
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
		}
		if (index == 0)
		{
			return this.removeFirst();
		}
		else
		{
			Account result = MyLinkedList.remove(index - 1, this.head, this.head.next);
			this.size--;
			return result;
		}
	}

	private class LinkedListIterator implements	Iterator <Account>
	{
		private Node currNode;
		private Node prevNode;
		
		public LinkedListIterator()
		{
			this.currNode = null;
			this.prevNode = null;
		}
		@Override
		public boolean hasNext()
		{
			if (this.currNode == null)
			{
				return head != null;
			}
			return this.currNode.next != null;
		}
		@Override
		public Account next() 
		{
			if (!this.hasNext())
			{
				throw new NoSuchElementException();
			}
			this.prevNode = this.currNode;
			if (this.currNode == null)
			{
				this.currNode = head;
			}
			else
			{
				this.currNode = this.currNode.next;
			}
			return this.currNode.data;
		}
	
		@Override
		public void remove()
		{
			if (this.prevNode == this.currNode)
			{
				throw new IllegalStateException();
			}
			if (this.currNode == head)
			{
				head = this.currNode.next;
			}
			else
			{
				this.prevNode.next = this.currNode.next;
			}
			this.currNode = this.prevNode;
			size--;
		}
	}
}
