package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {
    public static void reacher(HashMap<String,Integer> hashMap){
        for(Integer ext:hashMap.values()){
            System.out.println(ext);
        }
    }
    public static void main(String[] args) {
        HashMap <String,Integer> dataMap=new HashMap<>();
        dataMap.put("IT",111);
        dataMap.put("HR",222);
        dataMap.put("Help",333);
        dataMap.put("Admin",444);
        //reacher(dataMap);
        System.out.println(dataMap);
        System.out.println(dataMap.entrySet());
        Set<Map.Entry<String, Integer>> map=dataMap.entrySet();
        System.out.println(map);
        for(Map.Entry<String, Integer> m:map){
            System.out.println(m);
        }




    }
}
