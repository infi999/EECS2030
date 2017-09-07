//package ca.mohaghegh.navid;

/**
 * Dog object.
 */
public class Dog extends Animal implements Lovable {

    /**
     * How old the Dog will be if (s)he is a human. Dog age is 7 times older when converted to human scale.
     */
    public static final int HUMAN_AGE_CONVERSION_FACTOR = 7;


    public Dog(String name) {
        super(name);
    }

    public int getHumanAge() {
        return super.getAge() * HUMAN_AGE_CONVERSION_FACTOR;
    }


    private int howLovelyIsThisDog = 10;


    public int getHowLovely() {
        return this.howLovelyIsThisDog;
    }


    public void setHowLovely(int howLovelyIsThisDog) {
        this.howLovelyIsThisDog = howLovelyIsThisDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", amountOfFoodPerDay=" + super.getamountOfFoodPerDay() +
                ", howLovelyIsThisDog=" + this.getHowLovely() +
                '}';
    }
}
