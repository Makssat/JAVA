package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Pactice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many names do you want to store?");
        int size = scan.nextInt();
        scan.nextLine();
        String studentNames [] =new String[size];
        for(int i=0;i<size;i++){
        System.out.println("Whats student name?");
         studentNames[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(studentNames));

    }
}
