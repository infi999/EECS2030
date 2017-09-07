public class Stack1<E> {
 private SimpleLinkedList<E> stack;
 public Stack1() {
 this.stack = new SimpleLinkedList<E>();

}
 public void push(E data) {
 this.stack.addFirst(data);

}
 public E pop() {
 return this.stack.remove(0);

}
 public static void main(String[] args) {
	 
	 Stack1 <Integer> sb = new Stack1 <Integer>();
     sb.push(1);
     sb.push(2);
     sb.push(9);
     System.out.print(sb.pop());
    
     System.out.print(sb.pop());
     System.out.print(sb.pop());
   
    
	 
	 
	 
 }
}