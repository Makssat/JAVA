package Methods;

public class AgeCalculator {
    public void AgeCalc(int i){

        int age=2021-i;
        System.out.println("Your age is :"+age);
    }public int AgeCalculator(){
        int age =2021-2015;
        System.out.println(age);
        return age;
    }
    public void AgeCalculator(String name,int a){
        int age=2021-a;
        System.out.println(name+" your age is "+age);
    }

    public static void main(String[] args) {
        AgeCalculator age=new AgeCalculator();
        age.AgeCalc(2001);
        int b= age.AgeCalculator();
        age.AgeCalculator("Maks",2000);
    }
}
