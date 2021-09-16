package loop;

public class ContinueBreakStatement {
    public static void main(String[] args) {
        OUTER:  //Name of outer loop,labeling;
        for(int number=0;number<5;number++){
            if(number==4){
                break;
            }
            for(char ch='A';ch<'H';ch++){
                if(ch == 'C'|| ch=='D'){
                    continue ;
                }
                System.out.print(number);
                System.out.println(ch);
            }
            System.out.println();

        }
    }
}
