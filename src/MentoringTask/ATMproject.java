package MentoringTask;

import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {
        String cardNumber="1234";
        String password="ahmet123";
        Scanner scan=new Scanner(System.in);
        int chances=3;
        int choice;
        int balance=100;
        int [] options=new int[]{5,10,20,50,100};
        int deposit;
        String[]bills=new String[]{"Gas","Electricity","Internet","Water"};
        double[]cost=new double[]{10,20,23,65};
        do{
            System.out.println("Enter a card number");
            String enteredCard=scan.nextLine();
            System.out.println("Enter a password");
            String enteredPassword=scan.nextLine();
            if(enteredCard.equals(cardNumber) && enteredPassword.equals(password)){
                System.out.println("Welcome to Bank of Amerika");

                do{ System.out.println("What would you like to do today?");
                    System.out.println("1-Withdrow\n2-Deposit\n3-balance\n4-Payment\n5-Change password\n6-Exit");
                    choice=scan.nextInt();
                    switch (choice){
                        case 1:
                            for(int i =0;i<options.length;i++){
                                System.out.println(options[i]+"$  ");
                            }
                            System.out.println("How much would you like to withdrow?");
                            int money= scan.nextInt();
                            if(balance>money){
                                balance-=money;
                                System.out.println("You succesfully withdrom"+money+"$.Your new balance is "+balance+"$");
                           break;
                            }else{
                                System.out.println("You dont have enough money!");
                                break;
                            }

                            case 2:

                                System.out.println("How much would you like to deposit?");
                                deposit=scan.nextInt();
                                balance+=deposit;
                                System.out.println("You succesfully deposited"+balance+" is your new balance ");
                        case 3:
                            System.out.println("Your balance is $"+balance);
                        case 4:
                            for(int i=0;i<bills.length;i++){
                                System.out.println(bills[i]+"="+cost[i]);
                            }
                            System.out.println("What bill would you like to pay?");
                            String option= scan.next();
                            for(int k=0;k< bills.length;k++)
                            {
                                if(option.equalsIgnoreCase(bills[k]))
                                    if(balance> cost[k]){
                                    balance-=cost[k];
                                    bills[k]="paid";
                                    cost[k]=0;
                                        System.out.println("You have succesfully paid"+bills[k]+" your new balance is "+ balance);
                                        break;
                            }else{
                                        System.out.println("You dont have enough balance ");
                                        break;
                                    }
                            }
                        case 5:
                        case 6:
                    }

                }while(true);

            }else{
                chances--;
                System.out.println("Wrong card Number or password.Please try again"+"You have "+chances+" left");
                if (chances==0){
                    System.out.println("Your card is hold by ATM.Please contact with Custemer service");
                    break;
                }

            }

        }while(true);
    }
}
