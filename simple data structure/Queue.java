public class Queue<E> {
 private MyArrayList<E> q;
 public Queue() {
 this.q = new MyArrayList<E>();

}
 public void enqueue(E element) {
 this.q.addLast(element);

}
 public E dequeue() {
 return this.q.remove(0);

}
 public int getSize(){
	 return this.q.getSize();
 }
 public boolean isEmpty(){
	 return this.q.getSize() == 0;
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
