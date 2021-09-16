package loop;

public class forLoop {
    public static void main(String[] args) {
        for(int number=1;number<=6;number++){//number is Local

            System.out.println(number+" Its for Loop");
        }
        int number=1;//this belongs to class
        for(;number<6;number++){

            System.out.println(number+" Its second for Loop");
        }
        for(;number<10;){
            number++;
            System.out.println(number+" Its third for Loop");
        }

    }
}
