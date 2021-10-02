package ArrayList;

import java.util.ArrayList;

public class Flower {
    String name;
    String color;
    int numberOfPetals;
    double price;

    public Flower(String name, String color, int numberOfPetals, double price) {
        this.name = name;
        this.color = color;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPetals=" + numberOfPetals +
                ", price=" + price +
                '}';
    }
    public static double totalPrice(ArrayList<Flower> list){
        double totalPrice=0;
        for(int i=0;i<list.size();i++){
            totalPrice+=list.get(i).price;
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        ArrayList<Flower> flowers=new ArrayList();
        Flower fl1=new Flower("RedRose","Red",12,22.5);
        Flower fl2=new Flower("Rose","White",56,2.5);
        Flower fl3=new Flower("YellowRose","Yellow",2,23.5);
        flowers.add(fl1);
        flowers.add(fl2);
        flowers.add(fl3);
        System.out.println(fl1.toString());
        System.out.println(flowers);
        System.out.println(fl1.price);
        System.out.println( totalPrice(flowers));

    }

}
