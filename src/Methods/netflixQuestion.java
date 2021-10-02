package Methods;

public class netflixQuestion {
    String accauntName;
    String userName;
    static double monthlyData=100;
    public void usage(double used){
        monthlyData-=used;
        System.out.println(accauntName+" has "+ monthlyData+ " data");
    }

    public static void main(String[] args) {
        netflixQuestion user=new netflixQuestion();
        user.accauntName="Maks's family";
        user.userName="maks";
        user.userName="kids";
        user.usage(12);
        user.usage(50);
        user.usage(38);

    }
}
