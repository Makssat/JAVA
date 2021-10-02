package MentoringTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class InterviewQuestion {
    public static boolean isTrue(ArrayList<String>name,String names){
        String search=names;

        for (int i = 0; i < name.size(); i++) {
            if(name.get(i)==names){
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        name.add("Maksat");
        name.add("KAna");
        name.add("Ahmet");
        name.add("HI");
        name.add("Adel");
        name.add("Job");
        name.add("123");
        System.out.println(name);

//        boolean isTrue=false;
//        for (int i = 0; i < name.size(); i++) {
//            if(name.get(i)=="3"){
//                isTrue=true;
//            }
//
//        }
//        System.out.println(isTrue);
        System.out.println(isTrue(name,"Ahmet"));
        LinkedList<Integer> nm=new LinkedList<>();
        nm.add(12);
        nm.add(34);
        nm.add(54);
        System.out.println(nm);
        System.out.println("***********");
        System.out.println(nm.hashCode());


    }
}
