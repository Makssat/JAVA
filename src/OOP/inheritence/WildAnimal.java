package OOP.inheritence;

public class WildAnimal extends Animal{
    String name="Croc";
    String color;
    int age;

    @Override
    public void eat() {
        System.out.println("Wilf Animal is eating");
    }public void sleep(){
        System.out.println("Wild animal is sleeping");
    }
}
