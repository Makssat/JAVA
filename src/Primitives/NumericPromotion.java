package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte b1 = 112;
        short sh1 = 30;
        //byte sum1 = b1+sh1;it will not compile bc of numericPromotion java want to see as a integer
        int sum1 = b1+sh1;
        float fl1 = 2.3f;
        double db1 =3.4;
       // float sum2 = fl1+db1; compile time error
        System.out.println(fl1+db1);//not storing so it will work
        double sum2 = fl1+db1;
       // int product1 = sum1*sum2;result is a decimal number number,cant store it in int data type
        double product1 = sum1*sum2;




    }
}
