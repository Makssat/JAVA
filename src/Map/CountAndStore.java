package Map;

import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {
        String[] brands = {"Nike", "NB", "Adidas", "Reebok", "Puma", "Armani", "Gucci", "Nike", "Puma","Puma"};
        HashMap<String,Integer> mapBrand=new HashMap<>();

        //Integer nm=1;
//        for (String br : brands){
//            if(br==br)
//            mapBrand.put(br,nm);
//        }
//        System.out.println(mapBrand);
//        Integer nm=1;
//        for (int i = 0; i < brands.length; i++) {
//
//            for (int j = i+1; j < brands.length ; j++) {
//
//                if(brands[i].equalsIgnoreCase(brands[j])){
//                    nm=nm++;
//                }else if (!brands[i].equalsIgnoreCase(brands[j])){
//                    mapBrand.put(brands[i],nm);
//                }
//            }
//        }
//        System.out.println(mapBrand);
        Integer nm=1;
        for (int i = 0; i < brands.length; i++) {
            if(!mapBrand.containsKey(brands[i])){
                mapBrand.put(brands[i],nm);
            }else {
                //nm++;
                mapBrand.put(brands[i],mapBrand.get(brands[i])+1);
            }
        } System.out.println(mapBrand);

    }
}
