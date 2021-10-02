package Set;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashSet set1=new HashSet();
        HashSet<String> set2=new HashSet<>();
        Set set3=new HashSet();
        set1.add("Bishkek");
        set1.add("Chicago");
        set1.add("Chicago");
        set1.add("Houston");
        set1.add(12);
        set1.add(true);
        set1.add(true);
        set1.add(null);
        System.out.println(set1);
        set1.remove(null);

        //set1.get    There is no get method,bc no specific index numbers of it!
        for (int i = 0; i < set1.size(); i++) {
            if(set1.contains("Chicago") ){
                System.out.println("*********");
                break;
            }
        }
        set1.clear();
        System.out.println(set1);


    }
}
