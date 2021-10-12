package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        HashMap<String,Double>map1=new HashMap<>();
        HashMap<String, HashSet<Integer>>map2=new HashMap<>();
        HashMap<HashMap<String,Integer>,String>map3=new HashMap<>();

        map.put("11","Maksat");
        map.put("22","Ronaldo");
        map.put("18","Messi");
        System.out.println(map);
        map.put("33","Zack");
        System.out.println(map);
        map.put("33","Maks");
        map.put(null,"Maks");
        map.put(null,"MAp");//its reassign null value key
        map.put("77",null);
        System.out.println(map);
        System.out.println(map.get("11"));//Get() get value of map
        System.out.println(map.size());
        Set<String> z=map.keySet();///Return type of keySet() is SET
        System.out.println(z);
        //
        for(String x:z ){
            System.out.println(map.get(x));
        }

    }
}
