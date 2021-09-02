package Primitives;

public class Precedence {
    public static void main(String[]args){
        int count =10+15;//25
        int count1 =count +3*5;//25+15
        System.out.println(count1);
        int count2=count-count1/2*3;
        System.out.println(count2);
        int count3 = 6/3*5%3;
        System.out.println(count3);
        int count4 = 6-4-count+count3;
        System.out.println(count4);


    }
}
