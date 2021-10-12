package Map;

import java.util.Random;

public class EmployeeClass {
    String name;
    String city;
    int age;
    Long id;

    public EmployeeClass(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = idInitialzer();
    }
    public static long idInitialzer(){
        Random random =new Random();

        long id=0;
        for (int i=1;i<5;i++){
            id=(id*10)+random.nextInt();
        }
        return id;
    }
}
