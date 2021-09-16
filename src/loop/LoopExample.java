package loop;

public class LoopExample {
    public static void main(String[] args) {
        String string="Today is the day to practice for loop";
       int count=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='o'){
                System.out.println(string.charAt(i));
                System.out.println(i);//index
                count++;
                System.out.println(count);

            }
        }


    }
}
