package DesignPatterns;

public class Samosa{
    /**
     * 1. Constructor should be private
     * 2. Create an object with the help of method
     * 3. Create a field to store object which is private
    **/
    private static Samosa samosa;
    private Samosa(){

    }
    public static Samosa getSamosa(){
        // It will create an object of this class


            if(samosa==null) {
                synchronized (Samosa.class){
            samosa = new Samosa();
    }}
        return samosa;

    }
}
