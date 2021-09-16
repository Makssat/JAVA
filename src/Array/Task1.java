package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many names do you want to store for ?");
        int size1 = scan.nextInt();

        scan.nextLine();
        String longNames [] =new String[size1];
        String shortNames[]=new String[size1];


        for(int i=0;i<size1;i++){
            System.out.println("Whats student name?");
            String name=scan.nextLine();

            if (name.length()>=5){
                longNames[i]=name;

            }else{
                shortNames[i]=name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
    }
}
