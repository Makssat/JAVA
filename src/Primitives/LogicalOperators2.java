package Primitives;

public class LogicalOperators2 {
    public static void main(String[] args) {
        int kidAge= 6;
        int kidHeight = 67;
        int agereqmin=5;
        int agereqmax=12;
        int heightmin=46;
        boolean pass= kidAge>=agereqmin && kidAge<=agereqmax;
        boolean passheight =kidHeight>=heightmin;
        boolean finalpass = pass && passheight;
        System.out.println(finalpass);

    }
}
