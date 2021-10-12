package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class EmployeeTest {


    public static void main(String[] args) {
      EmployeeClass emp1=new EmployeeClass("Maksat","NY",24);
        EmployeeClass emp2=new EmployeeClass("Bro","Chicago",5);
        EmployeeClass emp3=new EmployeeClass("Isla","Denver",25);
        EmployeeClass emp4=new EmployeeClass("Java","Houston",78);
        HashMap<Long,Object> map=new HashMap<>();
        map.put(emp1.id, emp1);
        map.put(emp2.id, emp2);
        map.put(emp3.id, emp3);
        map.put(emp4.id, emp4);
        System.out.println(map);
        for( Long str: map.keySet()){
            System.out.println(str);
        }
    }
}
