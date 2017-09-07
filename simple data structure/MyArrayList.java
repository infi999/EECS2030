
public class MyArrayList<E> 
{
public final int DEFAULT_SIZE = 10;
private int size;
private E[] array;
@SuppressWarnings("unchecked")
public MyArrayList()
{
array = (E[]) new Object[DEFAULT_SIZE];
size = 0;
}

public int getSize()
{
return size;
}

public void set(int index, E c)
{
array[index] = c;
}

public E remove(int index)
{
E result = array[index];
shiftTowardsStart(index + 1);
size--;
return result;
}
// Shift elements by one towards the start of the array
private void shiftTowardsStart(int current)
{
array[current - 1] = array[current];
if (current == getSize() - 1 || current == getSize())
{
array[current] = null;
}
else
{
shiftTowardsStart(current + 1);
}
}

public void addLast(E c)
{
 int index = getSize();
	array[index] = c;
}

 public void addFirst(E c)
{ int index = 0;
  array[index]=c;
}

public String toString()
{
StringBuilder sb = new StringBuilder();
sb.append("[");
toString(0, sb);
sb.append("]");
return sb.toString();
}
private void toString(int index, StringBuilder sb)
{
if (index < getSize() - 1)
{
sb.append(array[index] + ", ");
toString(index + 1, sb);
}
else if (index < getSize())
{
sb.append(array[index]);
}
}


	public static void main(String[] args) {
	/*	MyArrayList<Integer> list = new MyArrayList <Integer>();
	   list.add(0, 1);
       list.add(1, 1);
       list.add(2, 333);
       list.add(3, 22);
       list.add(4, 1);
       list.add(5, 22);
       list.remove(5);
       
       System.out.print(list);
       list.set(1, 555);
       System.out.print(list);
       System.out.print(list.getSize()); */
       
       
       Stack <Integer> sb = new Stack <Integer>();
       sb.push(1);
       sb.push(2);
       System.out.print(sb.pop());
       sb.push(9);
       System.out.print(sb.pop());
       System.out.print(sb.pop());
       System.out.print(sb.getSize());
       System.out.println(sb.isEmpty());
       
     /* Queue <Integer> sd = new Queue <Integer>();
      sd.enqueue(1);
      System.out.print(sd.dequeue());
      sd.enqueue(1);
      sd.enqueue(1);
      sd.enqueue(55);
      sd.enqueue(66);
      System.out.print(sd.dequeue());
      sd.enqueue(88);
      System.out.print(sd.dequeue());
       */
       
	}

}
