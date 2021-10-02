package Set;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();
        hashSet.add(12);    linkedHashSet.add(1);       treeSet.add(9877);
        hashSet.add(23);    linkedHashSet.add(15);      treeSet.add(7);
        hashSet.add(11);    linkedHashSet.add(76);      treeSet.add(4);
        hashSet.add(null);  linkedHashSet.add(2);       treeSet.add(67);
        hashSet.add(4);     linkedHashSet.add(45);      treeSet.add(5);
        hashSet.add(90);    linkedHashSet.add(null);    treeSet.add(3);
        System.out.println("HashSet-->"+hashSet);
        System.out.println("linkedHashSet-->"+linkedHashSet);
        System.out.println("TreeSet"+treeSet);
        System.out.println(linkedHashSet);
        for (int i = 0; i < treeSet.size(); i++) {
            if(treeSet.toString().equalsIgnoreCase("35")){
                System.out.println("true");
            }
        }
        //Iterate collections
        Iterator iterator=treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList<String> vegggies=new ArrayList<>();
        vegggies.add("Tomato");
        vegggies.add("Potato");
        vegggies.add("Cucumber");
        vegggies.add("Carrot");
        vegggies.add("Carrot");
        Iterator it=vegggies.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
        Collections.sort(vegggies);
        System.out.println(vegggies);
        HashSet set1=new HashSet(vegggies); //ArrayList to HashSet
        System.out.println(set1);
        ArrayList list1=new ArrayList(set1);
        System.out.println(list1);
        list1.add("Tomato");
        System.out.println(list1);
    }

}
