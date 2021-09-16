package loop;

public class perfectNUmber {
    public static void main(String[] args) {
        int num=28;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
                System.out.println(i+"");
            }
        }
        if (sum==num){
            System.out.println("Is perfect number");
        }else{
            System.out.println("Its not a perfect number");
        }
    }
}
