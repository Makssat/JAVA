package Primitives;

public class logicalNegation {
    public static void main(String[] args) {
        boolean haveMoney = false;
        System.out.println(haveMoney);
        //!havemoney = true; compile time error
        System.out.println(!haveMoney);
        boolean isCarOn = true;
        isCarOn=false;
        System.out.println(!isCarOn);

    }
}
