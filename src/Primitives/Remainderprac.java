package Primitives;

public class Remainderprac {
    public static void main(String[] args) {
        int number =555;
        int firstDigit = number%10;
        number= number/10;
        int secondDigit = number%10;
        number=number/10;
        int thirdDigit = number%10;
        System.out.println(thirdDigit+secondDigit+firstDigit);

    }
}
