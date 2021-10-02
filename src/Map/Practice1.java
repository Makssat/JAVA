package Map;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("11","Maksat");
        map.put("22","Ronaldo");
        map.put("18","Messi");
        System.out.println(map);
        map.put("33","Zack");
        System.out.println(map);
        map.put("33","Maks");
        map.put(null,"Maks");
        map.put(null,"MAp");
        System.out.println(map);
    }
}
