import DesignPatterns.FactoryDesign.CombinedClass;
import DesignPatterns.FactoryDesign.Factory;
import DesignPatterns.Singelton.Samosa;

import java.lang.reflect.Constructor;
import java.lang.*;

public class Main extends Check{
    public static void main(String[] args) throws Exception{
//    Check check = new Check();
//    check.area();
//    check.maxLength();
//        System.out.println(Samosa.getSamosa().hashCode());

        // Methods to break Singelton
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());
        Factory FACTORY= CombinedClass.getFactory("Manufacturing");
        FACTORY.salary();

    }
}





