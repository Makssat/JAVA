package WrapperClass;

public class StringToWrapper {
    public static void main(String[] args) {
    String str1="12345";
    Integer i1=Integer.valueOf(str1);
        System.out.println(i1);
       String str2="5.8";
       Float fl=Float.valueOf(str2);
       String str3="true";
       Boolean bl=Boolean.valueOf(str3);
        System.out.println(bl.equals(false));
        String str4="H";
        //Character.valueOf(str4) you can not convert string to char

    }
}
