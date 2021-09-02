package Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = "Fluffy";
        String lastName = "Brown";
        System.out.println(lastName);
        System.out.println("Please enter last name:");
        lastName=input.nextLine();
        System.out.println(lastName);

    }
}
