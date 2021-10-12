package Map;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        HashMap <Integer,String> map=new HashMap();
        map.put(1,"DesPlaines");
        map.put(2,"Chicago");
        map.put(3,"Evanston");
        map.put(4,"loop");
        map.put(5,"Austin");
        map.put(6,"NY");
        System.out.println(map.size());
        map.put(null,"Denver");
        System.out.println(map);
        map.put(1,"LA");
        System.out.println(map);
        map.replace(1,"LA","HEllo");
        System.out.println(map);
        Boolean bl=map.containsKey(1);
        boolean bl1=map.containsKey(2);
        Boolean bl2=map.containsValue("LA");
        System.out.println(bl2);
        /////////////////////////////////////
        Set <Integer> zipCodes=map.keySet();
        for( Integer ch: zipCodes){
            System.out.println(map.get(ch)); //pass each key into get method
        }
        //List<String> ch= (List<String>) map.values();//Have to cast for list
        Collection cities = map.values();
        System.out.println(cities);
    }
}
