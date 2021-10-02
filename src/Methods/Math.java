package Methods;

public class Math {
    public void addition(int a,int b){
//        int a=2;
//        int b=3;
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
    public int sum1(int a,int b, int c){
        int sum= a+ b+ c;
        System.out.println(sum);
        return sum;

    }
    public void mathMethods(String operation,int c, int d){
        switch (operation){
        case "add":
        System.out.println("The sum is "+(c+d));
        break;
        case "substract":
            System.out.println("The difference is "+(c-d));
            break;
            case "multiple":
                System.out.println("The product is: "+(c*d));
                break;
            case "divide":
                System.out.println("The division is "+(c/d));
            break;
            case "remainder":
                System.out.println("The remainder is "+(c%d));
                break;
            default:
                System.out.println("Operation  name should be : add,substract,multiple,divide,remainder");

    }}
}
