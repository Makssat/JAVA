package Constructor;

public class CupTest {
    public static void main(String[] args) {
        Cup c1=new Cup(12,true,29.4);
        System.out.println(c1.isClean);
        Cup c2=new Cup();
        System.out.println(c2.isClean);
        c1.info();
        c2.info();
        Cup c3=new Cup(12,false,45.6);
        System.out.println(c3);
        c1=null;
        Cup c4=c1;
        System.out.println(c4);
        Cup c5=new Cup();
        c5=null;
        System.gc();

    }

}
