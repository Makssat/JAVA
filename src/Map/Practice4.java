package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Practice4 {
    public static void main(String[] args) {
        HashMap<String,Double> map1=new HashMap();
        LinkedHashMap<String,Double>map2=new LinkedHashMap();
        TreeMap<String,Double> map3=new TreeMap();
        map1.put("Coke",3.99);               map2.put("Coke",3.99);                map3.put("Coke",3.99);
        map1.put("Lemon juice",1.99);        map2.put("Lemon juice",1.99);         map3.put("Lemon juice",1.99);
        map1.put("Coffee 1",4.99);             map2.put("Coffee",4.99);              map3.put("Coffee",4.99);
       //Tree Map can not store null
        System.out.println("Map 1"+map1);
        System.out.println("Map 2"+map2);
        System.out.println("Map 3"+map3);

    }
}
