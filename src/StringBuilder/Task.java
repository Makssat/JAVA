package StringBuilder;

public class Task {
    public static void main(String[] args) {
        String str="";
        char ch='A';
        while(ch<='Z'){
            str+=ch+",";
            ch++;
        }
        System.out.println(str);
        System.out.println(str.substring(0,str.length()-1));
    }
}
