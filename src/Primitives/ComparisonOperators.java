package Primitives;

public class ComparisonOperators {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 4;
        //== compares the values are equal
        System.out.println(a==b);//false
        System.out.println(b==c);//true
        System.out.println(a==c);//false
        System.out.println(!(a==b));
        System.out.println(!(b==c));

        System.out.println(a != b);//not equal so it true
        System.out.println(b != c);//b and c is equal so its false
        /////////////////////////////////////
        System.out.println(a>b);
        System.out.println(b>c);
        System.out.println(a<b);//3 less then 4 so true
        System.out.println(b<c);//false they are equal
        System.out.println(c>=b);//not greater but equal //true
        System.out.println(a <= c);//true






    }
}
