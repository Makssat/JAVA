package Primitives;

public class LogicalOperators {
    public static void main(String[] args) {
        int attenting = 100;
        int score = 70;
        boolean attend = attenting>=95 && attenting<=100 || score>70 && score<100;
        System.out.println(attend);

    }
}
