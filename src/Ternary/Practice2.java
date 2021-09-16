package Ternary;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Which brand are you interested(Samsung TV,Other TV)");
        String response= input.nextLine();
        String answer= (response.equalsIgnoreCase("Samsung")) ? "Samsung TV prices starting from $1199"
                :"other tv prices begin from $599";
        System.out.println(answer);

    }
}
