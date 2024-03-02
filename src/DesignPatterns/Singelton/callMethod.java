package DesignPatterns.Singelton;

public class callMethod{
    public static void call(){
//    Samosa samos=Samosa.getSamosa();
//        System.out.println(samos);
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());


    /*
    * Break Singelton
    * 1. Reflection API to break singeloton API
    * */
    }
}
