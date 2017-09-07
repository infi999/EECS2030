public class Queue1<E> {
 private SimpleLinkedList<E> q;
 public Queue1() {
 this.q = new SimpleLinkedList<E>();

}
 public void enqueue(E element) {
 this.q.add(element);

}
 public E dequeue() {
 return this.q.remove(0);

}
 public int getSize(){
	 return this.q.size();
 }
 public boolean isEmpty(){
	 return this.q.size() == 0;
 }
 
 public static void main(String[] args) {
 Queue1 <Integer> sd = new Queue1 <Integer>();
 sd.enqueue(1);
 sd.enqueue(1);
 sd.enqueue(1);
 sd.enqueue(55);
 sd.enqueue(66);
 System.out.print(sd.dequeue());
 System.out.print(sd.dequeue());
 System.out.print(sd.dequeue());
 System.out.print(sd.dequeue());
  
}}