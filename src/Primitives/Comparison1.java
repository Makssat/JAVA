package Primitives;

public class Comparison1 {
    public static void main(String[] args) {
        int x = 10;
        int y =10;
        int z=  65;
        boolean result1 = x==y;//true
        System.out.println(result1);
        char ch1 = 'A';
        char ch2 =65;
        char ch3 = 66;
        boolean result2 = ch2==ch2;
        boolean result3 = z==ch2;
        System.out.println(result3);
        boolean compare = z<ch3;
        System.out.println(!compare);

    }
}
