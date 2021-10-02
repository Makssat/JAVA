package Methods;

public class StaticPracticePet {
    String name;
    int age;
    String color;
    static int foodAmount=20;//Static belongs to class and its shareable now !
    public void eat(){
        foodAmount-=1;
        System.out.println("left over food is : "+foodAmount);
    }
    public static void run(){
        //static int =24; local variables can not be static
        System.out.println("Cat is running!");
    }

    public static void main(String[] args) {
        StaticPracticePet cat=new StaticPracticePet();
        cat.name="Felix";
        cat.age=3;
        cat.color="White";
        cat.eat();

        StaticPracticePet cat1=new StaticPracticePet();
        cat1.name="Moorzik";
        cat1.age=4;
        cat1.color="Black";
        cat1.eat();
        cat.run();
        run();
        StaticPracticePet.run();


    }
}
