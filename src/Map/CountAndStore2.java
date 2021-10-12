package Map;

import java.util.HashMap;

public class CountAndStore2 {
    public static void main(String[] args) {
        String str="Itn is  easy with practice ";
        HashMap<Character,Integer> map1=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                continue;
            }
          if(!map1.containsKey(str.charAt(i))){
              map1.put(str.charAt(i),1);

          } else{
              map1.put(str.charAt(i),map1.get(str.charAt(i))+1);
          }
        }
        System.out.println(map1);
    }
}
