package String;

import java.util.Locale;
import java.util.Scanner;

public class TaskWarmUp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter message");
        String myScanner=input.nextLine();
        System.out.println(myScanner.trim());
        System.out.println(myScanner.replace('a','*'));
        System.out.println(myScanner.replace("e","**"));
        System.out.println(myScanner.toUpperCase());
        int index1=myScanner.indexOf("*");
        System.out.println(index1);
        System.out.println(index1*10);
        System.out.println(myScanner);
        int middleindex= myScanner.length()/2;

        System.out.println(myScanner.charAt(middleindex));
    }
}
