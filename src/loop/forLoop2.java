package loop;

public class forLoop2 {
    public static void main(String[] args) {
        String text="Chicago";
        for (int i=0;i<=text.length()-1;i++){
            System.out.println(text.charAt(i));
        }
        System.out.println("This is Reverse");

        for (int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }



    }
}
