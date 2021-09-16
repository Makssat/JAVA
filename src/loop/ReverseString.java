package loop;

public class ReverseString {
    public static void main(String[] args) {
        String st1= "Selenium";
        String reverse="";
        for(int i=st1.length()-1;i>=0;i--){
            reverse+=st1.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equalsIgnoreCase(st1)){
            System.out.println("Its polindrome word");
        }else{
            System.out.println("Its not polindrome");
        }
    }
}
