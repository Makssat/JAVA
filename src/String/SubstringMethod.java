package String;

public class SubstringMethod {
    public static void main(String[] args) {
        String str1="Techtorial";
        String subs =str1.substring(2,4);//first index included,last not included
        System.out.println(subs);
        String subs2= str1.substring(2);
        System.out.println(subs2);
        System.out.println(str1.substring(0));
        String str2="I will do it SOON";
        System.out.println(str2.substring(str2.length()-3));






    }
}
