package StringBuilder;

public class Practice2 {
    public static void myMethod(String str){
        StringBuilder builder=new StringBuilder(str);
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i)=='-'){
                builder.deleteCharAt(i);
            }
            i--;
        }
        System.out.println(builder);
    }
    public static void main(String[] args) {
       myMethod("I-n-t-e--------------------r-v-i-e-w");
    }
}
