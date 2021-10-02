package Object;

public class Animal {
    String name;
    int age;
    double weight;
    int legsNumber;
    double energy;

    public void run(String destination){
        energy-=10;

        System.out.println(name+" is running ");

    }
    public void sleep(){
        energy=100;
        System.out.println(name+" is sleeping");
    }
    public void printInfo(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Weight is "+weight);
        System.out.println("Legs number is "+legsNumber);
        System.out.println("Energy is "+energy);
    }

}
