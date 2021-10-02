package Methods;

import java.util.Random;

public class student {
    String name;
    String lastname;
    int age;
    Random random=new Random();
    public void sleep(int a){

        System.out.println(name+" is sleeping "+a+" hours ");
    }
    public void study(){
        generateHour();
        System.out.println(name+" is studying "+generateHour()+" hours ");
    }
    public void workout(){
        System.out.println(name+" is working out "+ generateHour()+" hour!");
    }
    public void info(){
        System.out.println(name+ lastname+age);
    }
    public static int name(int j){
        System.out.println(j);
        return j;
    }
    public int generateHour(){
        Random random=new Random();
        int hour=random.nextInt(10);
        return hour;
    }



    public static void main(String[] args) {
        student obj=new student();
        obj.name="Maksat";
        obj.lastname="Mamazhakyp";
        obj.age=20;
        obj.sleep(3);
        obj.info();
        name(12);
        obj.workout();
    }
}
