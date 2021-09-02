package Scanner;

import java.util.Scanner;

public class ScannerPracticeMyQuestion {
    public static void main(String[] args) {
        Scanner willInput= new Scanner(System.in);
        String line1 ="Please Enter Your name:";
        System.out.println(line1);
        line1= willInput.nextLine();
        System.out.println("Hello,"+line1);
        System.out.println("Please,"+line1+",enter your password");
        line1=willInput.nextLine();
        System.out.println(line1+"-is your password");



    }
}
