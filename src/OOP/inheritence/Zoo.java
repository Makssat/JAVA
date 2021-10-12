package OOP.inheritence;

public class Zoo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        System.out.println(animal.color);

        WildAnimal wildAnimal=new WildAnimal();
        System.out.println(wildAnimal.color);
        Cat cat=new Cat();
        System.out.println(cat.color);
        animal.color="Green";
        System.out.println(animal.color);
        System.out.println(cat.color);
        System.out.println(wildAnimal.color);
        System.out.println(cat.name);
        System.out.println(wildAnimal.name);
        Lion lion=new Lion();
        System.out.println(lion.name);
        animal.eat();
        lion.eat();
        wildAnimal.eat();




    }
}
