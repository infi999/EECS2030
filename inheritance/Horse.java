//package ca.mohaghegh.navid;

public class Horse extends Animal implements Lovable{
    public Horse(String name) {
        super(name);
    }
    
    private int howLovelyIsThisHorse = 10;
    public int getHowLovely() {
        return this.howLovelyIsThisHorse;
    }


    public void setHowLovely(int howLovelyIsThisDog) {
        this.howLovelyIsThisHorse = howLovelyIsThisDog;
    }
    
    
    
    @Override
    public String toString() {

        return "Horse{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", amountOfFoodPerDay=" + super.getamountOfFoodPerDay() + "howLovelyIsThisHorse =" +
                this.getHowLovely() + "}" ;
                }
    }
