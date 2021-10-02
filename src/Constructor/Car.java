package Constructor;

public class Car {
    String carBrand;
    int carYear;
    String carCountry;
    String carModel;
    double carPrice;
    public void moving(){
        System.out.println(carBrand+ " is moving");
    }
    public Car(){}

    public Car(String carBr,int carYe){
        carBrand=carBr;
        carYear=carYe;
    }

    @Override
    protected void finalize()  {
        System.out.println("Car is going to garbage!");
    }
}
