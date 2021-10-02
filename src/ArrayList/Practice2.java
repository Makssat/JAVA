package ArrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        ArrayList <String> colors=new ArrayList<>();
        colors.add("White");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Green");
        colors.add("Red");
        for(int i=0;i< colors.size();i++){
            System.out.println(colors.get(i));
        }
      //  Practice1 obj=new Practice1();
     ArrayList <String>friutNames=new ArrayList<>();
        friutNames.add("kiwi");
        friutNames.add("a");
        friutNames.add("ck");
        friutNames.add("plum");
        friutNames.add("celery");
        friutNames.add("banana");
        friutNames.add("apple");
        friutNames.add("rose");
        System.out.println(friutNames);
        System.out.println("***********");
        printFruit(friutNames);
        System.out.println(friutNames);


    }
    public static void printFruit(ArrayList<String> color){
        for(int i=0;i< color.size();i++)
            if(color.get(i).length()>=5){
                System.out.println(color.get(i));
            }else{
                color.remove(i);
            }

    }
}
