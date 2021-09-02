package String;

import java.util.Locale;

public class ConcatExample {
    public static void main(String[] args) {
        String text1= "Do whatever it takes";
        System.out.println(text1);
        text1=text1.concat(" to learn Java");
        System.out.println(text1);
        text1=text1.toUpperCase();
        System.out.println(text1);
        text1=text1.replace("JAVA","JOB");
        System.out.println(text1);
        System.out.println(text1.contains("Chicago"));
        System.out.println(text1);
        System.out.println(text1.charAt(0));

    }
}
