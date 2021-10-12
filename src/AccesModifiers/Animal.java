package AccesModifiers;

public class Animal {
    public String name;
    private String color;
    protected String  gender;
    int age;
    public void sleep(){
        System.out.println("Animal is sleeping!");
    }
    private void eat(){
        System.out.println("Animal is eating!");
    }
    protected void run(){
        System.out.println("Animal is running!");
    }
    void swim(){
        System.out.println("Animal is swimming!");
    }
}
