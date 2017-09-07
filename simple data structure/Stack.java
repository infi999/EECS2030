import java.util.ArrayList;

public class Stack<E> 
{
 private ArrayList<E> stack;
 public Stack()
{
 this.stack = new ArrayList<E>();
 }
 public void push(E element)
{
 this.stack.add(element);
 }
 public E pop()
{
 return this.stack.remove(this.stack.size() - 1);
 }
 public int getSize(){
	 return this.stack.size();
 }
 public boolean isEmpty(){
	 return this.stack.size() == 0;
 }
 public static void main(String[] args) {
 Stack <Integer> sb = new Stack <Integer>();
 sb.push(1);
 sb.push(2);
 sb.push(9);
 System.out.print(sb.pop());
 System.out.print(sb.pop());
 System.out.print(sb.pop());
 System.out.print(sb.getSize());
 System.out.println(sb.isEmpty());
}}