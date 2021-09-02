package Primitives;

public class LogicalComparison {
    public static void main(String[] args) {
        int myAge=21;
        boolean myDress=true;
        int ageRequirement= 21;
        boolean dressCode=true;
        boolean canIattand= myAge>=ageRequirement && myDress ==dressCode;
        System.out.println(canIattand);
        ////////////////////////////
        int myNewage =28;
        boolean myMoney = false;
        int ageReq = 18;
        boolean moneyreq=true;
        boolean canigo = myNewage>=ageReq||myMoney==moneyreq;
        System.out.println(canigo);
        myNewage=8;
        canigo= myNewage>=ageReq||myMoney==moneyreq;
        System.out.println(canigo);


    }
}
