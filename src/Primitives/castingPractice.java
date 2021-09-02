package Primitives;

public class castingPractice {
    public static void main(String[] args) {
        long l1= 120;
        //int i1 = l1; Larger data type can not strored in small data type
        int i2 = (int)l1;// explicit casting(Auto narrowing)
        double db1 = l1;//implicit casting(Auto widening)
        short apple = 800;
        short samsung = 600;
        short total = (short)(apple+samsung);
        System.out.println(total);
        byte total1 = (byte)(apple+samsung);
        System.out.println(total1);
        double d = 2.3;
        int i = 12;
        i += d; //14
        //when you do compound assignment,you dont need to do casting
        //explicit casting
        System.out.println(i);
    }
}
