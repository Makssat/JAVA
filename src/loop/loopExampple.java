package loop;

public class loopExampple {
    public static void main(String[] args) {
        String str="Hdisajfjhdsh!435654886*@#!";
        int countLetter=0;
        int countNumber=0;
        int countChar=0;
        for (int i =0; i < str.length()-1; i++){
            if(str.charAt(i)>='a' &&str.charAt(i)<='z'){
                countLetter++;
            }
            else if (str.charAt(i)>=48 && str.charAt(i)<=57){
                countNumber++;
            }
            else
                countChar++;
        }

        System.out.println("letter>> "+ countLetter+ " number>> "+ countNumber+ " char>>" + countChar);


        }
    }

