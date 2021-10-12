package Blocks;

public class Practice {
    int number;
   static int id;

    {
        number=23;
        System.out.println("Instance Block");
    }
   static  {
        id=25;
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Practice obj=new Practice();
        Practice obj1=new Practice();


    }
}
