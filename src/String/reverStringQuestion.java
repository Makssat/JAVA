package String;

public class reverStringQuestion {
    public String reverseString(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            str+=str.charAt(i);
        }
        return str.substring(str.length()/2);

    }
}
