package Array;

public class SpilitMethodExampple {
    public static void main(String[] args) {
        String name= "Hello Java is so cool";

        String []words=name.split(" ");
        for (int i=0;i<words.length;i++){
            String revers="";
            for (int k= words[i].length()-1;k>=0;k--){
                revers+=words[i].charAt(k);
            }System.out.println(revers);
            System.out.println(revers.charAt(0));
            System.out.println(revers.charAt(revers.length()-1));


        }

    }
}
