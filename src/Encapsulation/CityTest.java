package Encapsulation;

public class CityTest {
    public static void main(String[] args) {
        City city=new City();
        city.setName("Bishkek");
        System.out.println(city.getName());
        city.setPopulation(1264872);
        System.out.println(city.getPopulation());
        city.setEstablishmentYear(2012);
        System.out.println(city.getEstablishmentYear());
    }
}
