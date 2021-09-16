package Ternary;

public class ExampleTernary {
    public static void main(String[] args) {
        int a=20,b=10;
        boolean c =true,d=false;
        a=c ? b++ : b--;
        c=!d;
        System.out.println((a+b)+" "+(c?5:10));
    }
}
