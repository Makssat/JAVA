package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfo {
    public static void main(String[] args) {
     HashMap<String,String > map1=new HashMap<>();
     map1.put("FirstName", "David");
        map1.put("LastName", "Pena");
        map1.put("Age", "25");
        map1.put("Gender", "M");
        map1.put("City", "Chicago");

        HashMap<String,String > map2=new HashMap<>();
        map1.put("FirstName", "Jeremiah");
        map1.put("LastName", "Michaelson");
        map1.put("Age", "15");
        map1.put("Gender", "M");
        map1.put("City", "HighPark");

        HashMap<String,String > map3=new HashMap<>();
        map1.put("FirstName", "Michael");
        map1.put("LastName", "White");
        map1.put("Age", "35");
        map1.put("Gender", "M");
        map1.put("City", "Winnetka");

        List<HashMap<String,String>> studentList=new ArrayList<>();
        studentList.add(map1);
        studentList.add(map2);
        studentList.add(map3);
        System.out.println(studentList);
        ///////////////////
//        for(int i=0;i< studentList.size();i++){
//          if(Integer.parseInt(studentList.get(i).get("Age"))<20){
//              System.out.println(studentList.get(i).get("FirstName"));
//          }
//        }
//        for (int i = 0; i < studentList.size(); i++) {
//            if((studentList.get(i).get("City").equalsIgnoreCase("Chicago"))){
//                System.out.println(studentList.get(i).get("Name")+"chicago@com");
//            }
//        }



    }
}
