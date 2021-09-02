package String;

public class equalsClassMethod4 {
    public static void main(String[] args) {
        String a= "John";
        String b= "John";
        boolean bl1= a.equals(b);
        System.out.println(bl1);//True -they are same
        String c ="JoHN";
        System.out.println(a.equals(c));//False--They are not  same
        System.out.println(a.equalsIgnoreCase(c));//skips case return true
        System.out.println("JAVA IS".equalsIgnoreCase("java is"));//true ignoring case and returning true answer
        String str1= "Java is cool";
        System.out.println(str1.contains("COOL"));
        str1=str1.replace('o','$');//replacing o with $
        System.out.println(str1);
        String text1= "Easy";

        System.out.println(str1);
        str1= str1.replace("Java","Tava");
        System.out.println(str1);
        //////////////////TRIM METHOD/////////////////
        String text2= " Its Saturday ";
        text2=text2.trim();//removes spaces before and after
        System.out.println(text2);



    }

}
