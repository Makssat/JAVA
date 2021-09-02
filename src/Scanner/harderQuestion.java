package Scanner;

import java.util.Scanner;

public class harderQuestion {
    public static void main(String[] args) {
        /*
David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his money in the account
- he bought a phone for $599 and headphone for $299
- calculat his final money in his account
open a new class under scanner package and name it as "MoneyTransaction"
*/
        Scanner input= new Scanner(System.in);
        System.out.println("Hello,David How much would you want to deposit?");
        int davidMoney=200;
        int deposit1= input.nextInt();
        int after1=davidMoney+deposit1;
        System.out.println("You have"+after1+"$");
        System.out.println("How much would you want to deposit?");
        int deposit2=input.nextInt();
        int after2= after1+deposit2;
        System.out.println("You have"+after2+"$");
        System.out.println("How much would you want to deposit?");
        int deposit3= input.nextInt();
        int after3=after2+deposit3;
        System.out.println("You have"+after3+"$");
        System.out.println("How much did you spent?");
        int spent1= input.nextInt();
        int tot1=after3-spent1;
        System.out.println("You left"+tot1);
        System.out.println("How much did you spent?");
        int spent2= input.nextInt();
        int tot2=tot1-spent2;
        System.out.println("You left:"+tot2+"$");








    }
}
