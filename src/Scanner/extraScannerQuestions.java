package Scanner;

import java.util.Scanner;

public class extraScannerQuestions {
    public static void main(String[] args) {
        Scanner sprite = new Scanner (System.in);
        System.out.println("Please enter full name:");
        String fullName= sprite.nextLine();
        System.out.println("Your full name is -->"+fullName);
        char firstletter = sprite.next().charAt(0);//indexing
        System.out.println(firstletter);

    }
}
