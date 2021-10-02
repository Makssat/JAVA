package Methods;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class MathTest {
    public static void main(String[] args) {
        Math obj=new Math();
        obj.addition(65,78);
        obj.addition(1,34);
        obj.mathMethods("add",56,12);
        int x=obj.sum1(1,2,3);
        System.out.println(x+10);
    }
}
