package Array;

public class task3 {
    public static void main(String[] args) {
        String [] colors={"Red","Yellow","brown","White","Orange","Green","Pink","Black"};
        for(String ch:colors){

            String reverse="";
            for(int i=ch.length()-1;i>=0;i--){
                reverse+=ch.charAt(i);
            }
            System.out.println(reverse);
        }
    }
}
