package Methods;

public class OverloadingPractice {
    public double areaCalculator(double num1,double num2){
        double area=num1*num2;
        return area;
    }
    public double areaCalculator(double num1){
        return num1*num1;

    }
    public static void main(String[] args) {
        OverloadingPractice obj=new OverloadingPractice();
        double area1=obj.areaCalculator(4.5,6.7);
        System.out.println(area1);
        System.out.println(  obj.areaCalculator(1.9,6));

    }
}
