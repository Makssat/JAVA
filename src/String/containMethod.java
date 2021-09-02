package String;

public class containMethod {
    public static void main(String[] args) {
        String containString= "Verizon is one of the popular";
        System.out.println(containString.contains("eri"));//true
        System.out.println(containString.contains("is"));//True
        System.out.println(containString.contains("verizon"));//false v is lower case
        boolean trueResult= containString.contains("the");
        System.out.println(trueResult);
        String newString= "Techtorial";
        containString=newString+containString;
        System.out.println(containString.contains("Techtorial"));


    }
}
