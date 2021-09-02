package ExtraActivity;

import java.util.Scanner;

public class MethodsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value:");
        String letterToSymbol=input.nextLine();
        String symbol=letterToSymbol.replace('a','*');
        System.out.println(letterToSymbol.replace('a','*'));
        System.out.println(letterToSymbol.replace("e","*"));
        System.out.println(letterToSymbol.toUpperCase());
        int index1=symbol.indexOf('*');
        System.out.println(index1*10);
        System.out.println(letterToSymbol);


    }
}
