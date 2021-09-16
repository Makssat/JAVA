package Array;

import java.util.Arrays;

public class spilitClass {
    public static void main(String[] args) {
        String date="12.03.2021";
        String [] spilittedDate=date.split("\\.");
        System.out.println(Arrays.toString(spilittedDate));
        if(spilittedDate[0]=="12"){
            System.out.println("its corrrect month");
        }
        String date1="11/03/2021";
        String[] splitDate1=date1.split("/");
        System.out.println(Arrays.toString(splitDate1));


    }
}
