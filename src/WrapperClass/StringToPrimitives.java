package WrapperClass;

public class StringToPrimitives {
    public static void main(String[] args) {
        String str1="123";
        int i=Integer.parseInt(str1);
        System.out.println(i);
        String str2="maksat";
        boolean bl=Boolean.parseBoolean(str2);
        System.out.println(bl);
        String sttr3="A";
       // Character.parseCharacter(sttr3) Can not convert to char

    }
}
