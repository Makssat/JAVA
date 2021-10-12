package StringBuilder;

public class Practice4 {
    public static void myMethod(String stringBuilder){
        int count=0;
        String str=stringBuilder;

        for (int i = 0; i < str.length(); i++) {
            Character ch=str.charAt(i);
            if(Character.isDigit(ch) ){
                count+=Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        myMethod("uskjrshkhf32647236587%%%");
    }
}

