package Primitives;

public class UnaryOperators {
    public static void main(String[]args) {
        int studentNumber = 25;
        studentNumber = studentNumber+1;
        studentNumber +=1;
        studentNumber++;
        System.out.println(studentNumber);
        ++studentNumber;
        studentNumber--;
        --studentNumber;
        System.out.println(studentNumber);
        studentNumber=24;
        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++);//shows student number then increases it by 1 now its 25
        System.out.println(studentNumber);//25
        System.out.println(++studentNumber);//it shows 26,increases first then prints out
        System.out.println(studentNumber--);//shows 26,then decrease it
        studentNumber--;//goes to 24
        --studentNumber;//23
        System.out.println(--studentNumber);//decrease first 22,show 22

        System.out.println(studentNumber);// print 22
        int a = studentNumber++ + studentNumber++ + 5;//student number increased by 2
        a--;
        a=studentNumber;//student numebr is 24
        System.out.println(a--);

    }
}
