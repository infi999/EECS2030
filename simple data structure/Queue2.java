
public class Queue2<E> {
	
	private LinkedList<E> q;
public Queue2(){
	q = new LinkedList<E>();
}
public void enqueue(E element){
	q.addLast(element);
}
public E dequeue(){
	return q.removeFirst();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue2 <Integer> sd = new Queue2 <Integer>();
		 sd.enqueue(1);
		 sd.enqueue(1);
		 sd.enqueue(1);
		 sd.enqueue(55);
		 sd.enqueue(66);
		 System.out.print(sd.dequeue());
		 System.out.print(sd.dequeue());
		 System.out.print(sd.dequeue());
		 System.out.print(sd.dequeue());
	}

}
