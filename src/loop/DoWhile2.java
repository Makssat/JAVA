package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int sum=0;

        int a=10;
        do{
            sum=sum+a;
            a++;
        }while(a<=15);
        System.out.println("The total is-->"+sum);
    }
}
