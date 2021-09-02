package Scanner;

import java.util.Scanner;

public class ScanExample {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("PLeASE ENTER YOUR weight (in kg)");
        double weight=input.nextFloat();
        System.out.println("Please enter your height(meter)");
        double height=input.nextDouble();
        System.out.println("Your BMI is -->"+(weight/(height*height)));
    }
}
