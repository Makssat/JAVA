package Array;

public class multiExample {
    public static void main(String[] args) {
        String [][] names={{"Apple","Lenova","HP","Dell","Acer"},{"Samsung","LG","Sony"},{"Alexa","Google","Logitech","Jbl"}};
        double [][] price={{2500,1600,1800,1900,1100},{2199,1799,1599},{79.99,89.99,64.99,55.99}};
        for (int i=0;i<names.length;i++){
            for (int k=0;k<price[i].length;k++){
                System.out.println("Price for "+names[i][k]+" is $"+price[i][k]);
            }
        }
    }
}
