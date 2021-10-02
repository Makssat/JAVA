package WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Practice1 {
    public static void main(String[] args) {
        byte b1=2;
        Byte bt1=new Byte(b1);
        System.out.println(b1);
        System.out.println(bt1);
        short s1= 4;
        Short sh1= new Short(s1);
        //Short sh1=new Short(5) value is integer default
        Short sh2=new Short((short)5);
        Integer i1=new Integer(12);

        long l1=123;
        Long lg1=new Long(l1);
        Long lg2=new Long(123);

        Double db1=new Double (3.5);
        Float fl1=new Float(2.5);

        Boolean bl1=new Boolean(true);

        Boolean bl2= new Boolean("WWW");
        System.out.println(bl2==false);

        Character ch1=new Character('R');
        System.out.println(ch1);
        char c='T';
        Character ch2=new Character(c);
        //AutoBoxing;
        Integer i2=23;//AutoBoxing Java automatically boxing
        //value. 23 is primitie i converted to Object;

        Boolean bl3=true;
        //Unboxing;-->converting object to primivite;
        int a = new Integer(11);

        char c1=ch1;




    }
}
