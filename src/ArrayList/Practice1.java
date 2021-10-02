package ArrayList;

import Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();

        ArrayList list2= new ArrayList(3);

        ArrayList list3=new ArrayList(list1);

        ArrayList<Integer> list4=new ArrayList<>();

        ArrayList<Double>list5=new ArrayList<>();

        ArrayList<Car> list6=new ArrayList<>();//save car objects
        System.out.println(list1);
        list2.add("Maksat");
        list2.add(23);
        System.out.println(list2);
        list2.add('%');
        list2.add(23.3);
        System.out.println(list2);
        list2.add(2,44);
        System.out.println(list2);
        list2.remove(2);
        System.out.println(list2);
        System.out.println(list2.size());
        list2.add(4,66);
        System.out.println(list2);
        System.out.println(list2.get(1));
      //  System.out.println(list2.get(10));OutofBounds exception
        list2.remove("66");//if element not there cant do anything
        list2.add(66);
        System.out.println(list2);
        list2.remove((Object) 66);
        System.out.println(list2);
      //  list2.removeAll(ArrayList<>);
        list3.addAll(list2);
        System.out.println("List 3 "+list3);
        list3.add(77);
        System.out.println(list3);
        list3.removeAll(list2);//Removing all collection of List 2 from an Arraylist
        System.out.println(list3);
        list3.add(33);
        list3.add(100);
        ///////////
        list3.set(2,200);//Set method for replacing element
        list3.add("hi");
        ///get method gives me object
        System.out.println(list3.get(0).toString().startsWith("x"));//toString method comes from Object class
        list3.clear();
        System.out.println(list3);
        System.out.println(list3.size());




    }
}
