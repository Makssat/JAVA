package StringBuilder;

public class Practice3 {
    public static void myMethod(StringBuilder [] stringBuilder){
        for (int i = 0; i < stringBuilder.length; i++) {
            if(stringBuilder[i].length()%2!=0){
                stringBuilder[i].replace(stringBuilder[i].length()/2,(stringBuilder[i].length()/2)+1,"$");
                System.out.println(stringBuilder[i]);
            }
        }
    }
    public static void main(String[] args) {
        StringBuilder[] builder={new StringBuilder("David"),new StringBuilder("Diana"),new StringBuilder("Josh")};
        myMethod(builder);
    }
}
