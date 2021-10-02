package MentoringTask;

public class AlphaCharacters {
    public static void main(String[] args) {
        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String alphaetic="";
        String numbers="";
        String symbols="";
    for(int i=0;i<given.length();i++){
        char ch=given.charAt(i);
        if(Character.isAlphabetic(ch)){
            alphaetic+=ch;
        }else if (!Character.isAlphabetic(ch)&& Character.isDigit(ch)){
            numbers+=ch;
        }else{
            symbols+=ch;
        }

    }
        System.out.println("Alphabetic : "+alphaetic);
        System.out.println("Numbers: "+numbers);
        System.out.println("Symbols: "+symbols);

    }
}
