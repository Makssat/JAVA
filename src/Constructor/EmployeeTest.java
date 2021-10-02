package Constructor;

public class EmployeeTest {
    public static void main(String[] args) {
       Employee employee1=new Employee();
       employee1.name="Zack";
       employee1.age=24;
       employee1.set(11);
        System.out.println(employee1.employeeId);
        System.out.println(employee1.toString());
        employee1.info();
    }
}
