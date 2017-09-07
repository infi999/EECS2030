package Lab;

public class CreatRandomNumber {

    private static CreatRandomNumber instance = null;

    public static synchronized CreatRandomNumber getInstance() {
        if (null == instance){
            instance = new CreatRandomNumber();
            
        }
        return instance;
    }

    private CreatRandomNumber() {
    }


   public double getRandomNumber(){
	return  Math.random();
   }
	

	@Override
public String toString() {
	return "number: " + getRandomNumber();
}

	public static void main(String[] args) {
		CreatRandomNumber a = CreatRandomNumber.getInstance();
		
		System.out.print(a);


}
}
