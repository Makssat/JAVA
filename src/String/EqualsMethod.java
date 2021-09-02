package String;

public class EqualsMethod {
    public static void main(String[] args) {
        String a= "David";
        String b= "David";
        String c= new String ("David");//New Object created
        String d= new String("David");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==c);//false//different object
        System.out.println(a.equals(c));//value of oject same
        System.out.println(c==d);//not same object//False
        System.out.println(c.equals(d));//true
        System.out.println(a=="David");//true//same
        System.out.println(c=="David");//False
        String e = a;
        String f=c;
        System.out.println(e==b);
        System.out.println(f.equals(d));//true1

    }
}
