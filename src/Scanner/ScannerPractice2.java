package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type your Name:");
        String name = input.nextLine();
        System.out.println("Your name is: "+name);
    }
}
