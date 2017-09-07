import java.util.*;
//import ca.mohaghegh.navid.*;

public class Main {

   //A simple dummy generic method which add all myArray objects into the given collection object
   public static <MyGenericType> void fromArrayAddToCollection(MyGenericType[] myArray, Collection<MyGenericType> collection)
   {
        for (MyGenericType objectInMyArray : myArray)
        {
            collection.add(objectInMyArray);
        }
   }
	

    public static void main(String[] args) {

    	Puppy p1 = new Puppy();
    	p1.setamountOfFoodPerDay(0.5);    	
    	
    	
        Dog dog1 = new Dog("Ronny");
        dog1.setAge(9);
        dog1.setamountOfFoodPerDay(1);
        dog1.setHowLovely(100);


        Horse horse1 = new Horse("Thunder");
        horse1.setAge(6);
        horse1.setamountOfFoodPerDay(4);

        System.out.println("Dog1 --> " + dog1.toString());
        System.out.println("Horse1 --> " + horse1);
        System.out.println("Is Puppy an Animal? " + (p1 instanceof Animal));
        System.out.println("Is Dog an Animal? " + (dog1 instanceof Animal));
        System.out.println("Is Horse an Animal? " + (horse1 instanceof Animal));
        System.out.println("Dog is Lovable ? " + (dog1 instanceof Lovable));


	//////////////Test our Generic Method - Start/////////////////////
	
	String[] stringArray = new String[10]; 
	stringArray[0] = "Hello";
	stringArray[1] = "there!";
	stringArray[2] = "How";
	stringArray[3] = "is";
	stringArray[4] = "your";
	stringArray[5] = "day?";

        Collection<String> stringCollectionArrayList = new ArrayList<String>();
	fromArrayAddToCollection(stringArray, stringCollectionArrayList);

	for (Object o : stringCollectionArrayList)
	{
		 System.out.println(o);
	}
	
	//////////////Test our Generic Method - End//////////////////////

    }
}
