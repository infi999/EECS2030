//package ca.mohaghegh.navid;

/**
 * Abstract class representing Animal.
 */
public abstract class Animal
{
    private String name;
    private int age;
    private double amountOfFoodPerDay;

    /**
     * Get the name of the Animal
     * @return the name of the Animal
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the Animal
     * @param name is the name of the Animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the age of the Animal
     * @return the age of the Animal
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of the Animal
     * @param age is a positive number indicating the age of the Animal
     */
    public void setAge(int age) {
        if(age<0) {
            throw new IllegalArgumentException("Age should be a positive integer!");
        }
        else this.age = age;
    }


    /**
     * Get how much food this Animal uses ever day.
     * @return the amount of food consumed by this Animal every day in Kg.
     */
    public double getamountOfFoodPerDay() {
        return amountOfFoodPerDay;
    }

    /**
     *  Set how much food this Animal uses ever day.
     * @param amountOfFoodPerDay the amount of food consumed by this Animal every day in Kg.
     * @exception IllegalArgumentException if amountOfFoodPerDay is not greater than zero.
     */
    public void setamountOfFoodPerDay(double amountOfFoodPerDay) {
        if (amountOfFoodPerDay > 0)
        {
            this.amountOfFoodPerDay = amountOfFoodPerDay;
        }
        else throw new IllegalArgumentException("AmountOfFoodPerDay should be greater than zero!");
    }

    /**
     * private constructor
     */
    private Animal() {
    }

    /**
     * Create a new Animal with a give name
     * @param name is the name of this Animal
     */
    public Animal(String name){
        this.name = name;
    }

    /**
     * create a string representation of this Animal
     * @return the string representation of this Animal
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", amountOfFoodPerDay=" + amountOfFoodPerDay +
                '}';
    }
}
