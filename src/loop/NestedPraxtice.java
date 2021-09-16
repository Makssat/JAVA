package loop;

public class NestedPraxtice {
    public static void main(String[] args) {
        for(int i=2020;i<=2023;i++){
            for(int k=1;k<=12;k++){
                System.out.println("Year is "+i+" Month "+k);
                for(int week=1;week<=4;week++){
                    System.out.println(week+" week");
                }
            }

        }

    }
}
