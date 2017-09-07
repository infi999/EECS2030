import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterator <Transaction>
{
	
	private Node head;
	private int size;
	
	public MyLinkedList(Account1 a)
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
		public Transaction data;
		public Node next;
		
		public Node(Transaction t)
		{
			this.data = t;
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
	
	public void add(Transaction t)
	{
		if(this.getSize() == 0)
		{
			this.head = new Node(t);
		}
		else
		{
			MyLinkedList.add(t, this.head);
		}
		size++;
	}
	
	public static void add(Transaction t, Node node)
	{
		if(node.next == null)
		{
			node.next = new Node(t);
		}
		else
		{
			MyLinkedList.add(t, node.next);
			
		}
	}public String toString()
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
		return s + MyLinkedList.toString(node.next);}
	
	

		private Node currNode;
		private Node prevNode;
		

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
		public Transaction next() 
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

