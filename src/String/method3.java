package String;

import java.sql.SQLOutput;
import java.util.Locale;

public class method3 {
    public static void main(String[] args) {
        String string= "Selenium";
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        string= string.toLowerCase();
        String startsMethod= "Do whatever good";//return true or false of startwith method
        System.out.println(startsMethod.startsWith("Do"));//True --- answer
        System.out.println(startsMethod.startsWith("whatever"));//false
        //////////////////////////////////////////
        startsMethod.endsWith("good");//true
        startsMethod.endsWith("d");//true
        System.out.println(startsMethod.endsWith("Do"));//false




    }
}
