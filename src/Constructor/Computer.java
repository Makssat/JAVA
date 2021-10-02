
package Constructor;

public class Computer {
    double price;
    public double totalPrice(){
      double []price =new double[4];
      double totalSum=price[0]+price[1]+price[2]+price[3];
      return totalSum;
    }
    public Computer(double price){

    }
    public static void main(String[] args) {
        Computer c1=new Computer(23);
        c1.price=23;
        System.out.println(c1.price);
        
    }
}
