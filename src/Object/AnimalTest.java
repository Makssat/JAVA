package Object;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat= new Animal();
        System.out.println(cat.name);
        cat.name="Tom";
        System.out.println(cat.name);
        cat.age=5;
        cat.weight=8.5;
        cat.legsNumber=4;
        System.out.println(cat.legsNumber);
        Animal dog=new Animal();
        dog.name="Rex";
        dog.legsNumber=5;
        dog.age=7;
        dog.weight=10.7;
        System.out.println(dog.weight);
        cat.run("North");
        dog.run("Downtown");
        cat.sleep();
        dog.sleep();
        cat.printInfo();
        dog.printInfo();
        System.out.println("***************");
        cat.printInfo();
        cat.energy=100;
        cat.printInfo();
        cat.run("South");
        cat.run("up");
        cat.printInfo();
        cat.sleep();
        cat.printInfo();
        System.out.println("###############");
        Animal bird=new Animal();
        bird.energy=100;
        bird.sleep();
        bird.run("in to Air");
        bird.printInfo();
    }
}
