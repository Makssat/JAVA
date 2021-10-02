package ArrayList;

import java.util.ArrayList;

public class Computer {
    String make;
    String model;
    double price;
    double screen;

    public Computer(String make, String model, double price, double screen) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screen = screen;
    }
    public static void method(ArrayList<Computer>list) {
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).price>=500 &&list.get(i).price<=1500){
                System.out.println(list.get(i).make);
            }
        }
    }

    public static void main(String[] args) {
        Computer pc1=new Computer("Apple","Macbook Air",1500,13.5);
        Computer pc2=new Computer("Apple","macbookpro",2000,16);
        Computer pc3=new Computer("HP","envy",1100,15);
        Computer pc4=new Computer("Lenova","ThinkPad",900,11);
        ArrayList<Computer> pcs=new ArrayList<>();
        pcs.add(pc1);
        pcs.add(pc2);
        pcs.add(pc3);
        pcs.add(pc4);
        method(pcs);


    }

}
