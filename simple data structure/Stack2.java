
public class Stack2<E> {
	private LinkedList<E> stack;
public Stack2(){
	stack = new LinkedList<E>();
}
public void push(E element){
	this.stack.addFirst(element);
}
public E pop(){
	return stack.removeFirst();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack2 <Integer> sb = new Stack2 <Integer>();
	     sb.push(1);
	     sb.push(2);
	     sb.push(9);
	     System.out.print(sb.pop());
	    
	     System.out.print(sb.pop());
	     System.out.print(sb.pop());
	   
	}

}
