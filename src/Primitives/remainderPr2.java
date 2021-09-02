package Primitives;

public class remainderPr2 {
    public static void main(String[] args) {
        int number = -2222;
        int firstNumb = number%10;//this is first digigt
        number=number/10;// this new number 345
        int secondNumb = number%10;//
        number=number/10;//ten times less/reassigning
        int thirdNumb = number%10;
        number=number/10;
        int fourthNumb = number%10;
        System.out.println(firstNumb*secondNumb*thirdNumb*fourthNumb);


    }
}
