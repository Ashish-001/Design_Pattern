package DesignPatterns.FactoryDesign;

import javax.print.DocFlavor;

public class CombinedClass {
    public static Factory getFactory(String typeOfEmp){
        if(typeOfEmp.trim().equalsIgnoreCase("COMPANY")){
            return new Company();
        } else if (typeOfEmp.trim().equalsIgnoreCase("MANUFACTURING")) {
            return new Manufaturing();
        }
        else return null;
    }

}
