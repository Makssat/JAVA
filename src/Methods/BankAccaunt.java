package Methods;

public class BankAccaunt {
    String bankName="Java Bank";
    int accauntNumber;
    double balance;
    String accauntHolderName;
    boolean loggedIn;
   String userName;
   String password;
   public void accauntInfo(){
        System.out.println("Bank name: "+bankName+"\n Accaunt number is : "+accauntNumber+"\nBalance is :"+balance+"" +
                "\nAccaunt holders name: "+accauntHolderName+"\nLogged in : "+loggedIn);
    }
    public double deposit(double depositAmount){
       balance+=depositAmount;
        System.out.println("Your new amount on your balance is :"+balance);
       return balance;
    }
    public double withdrow(double withdrowAmount){
        balance-=withdrowAmount;
        System.out.println("Your new balance is :"+balance);
        return balance;
    }
    public boolean logIn(String user,String pass){
       if(user.equals(userName) && pass.equals(password)){
           loggedIn=true;
           System.out.println("You succesfully logged in!");
       }else{
           System.out.println("Wrong input,try again!");
       }
       return loggedIn;
    }

    public static void main(String[] args) {
        BankAccaunt java=new BankAccaunt();
        java.accauntInfo();
        java.accauntNumber=12345;
        java.accauntHolderName="Joe";
        java.userName="abc";
        java.password="123";
        java.balance=10000;
        java.accauntInfo();
        java.deposit(5000);
        java.withdrow(60);
        java.logIn("abc","123");
    }
}
