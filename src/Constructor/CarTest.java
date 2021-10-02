package Constructor;

public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car("Toyota",2020);
        c1.moving();
//        for(int i=0;i<5;i++){
//            String name="str";
//            Car name+i=new Car("BMW",2021);
//        }
        Car c2=new Car();
        c2=null;
        System.gc();





    }
}
