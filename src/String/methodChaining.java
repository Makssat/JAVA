package String;

public class methodChaining {
    public static void main(String[] args) {
        String text1 = "  Just do It   ";
        int x=text1.trim().toUpperCase().replace('u','#').indexOf('J');
        System.out.println(x);

    }
}
