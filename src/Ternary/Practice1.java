package Ternary;

public class Practice1 {
    public static void main(String[] args) {
        int num1=5;
        int num2=5;
        int num3=6;
        int result=num1==num2 ? 25:30;//if condition true first value will printed
        System.out.println(result);
        String result2 = num1==num3 ? "Hello": "bye";
        System.out.println(result2);
        System.out.println(num1==num2 ? "good morning":5);//when value mix int and string cant store in data  type
        int result3= num1 ==num3 ? num1++ + num2++ : num3++ + num3;
        System.out.println(result3);
    }
}
