package Switch;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number 1-7");
        int number= input.nextInt();
        switch(number){
            case 1:
                System.out.println("Its monday");
            break;
            case 2:
                System.out.println("Its tuesday");
            break;
            case 3:
                System.out.println("Its wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its friday");
                break;
            case 6:
                System.out.println("Its saturday");
                break;
            case 7:
                System.out.println("Its sunday");
                break;
            default:
                System.out.println("Number is not in the range");
        }
    }
}
