package MentoringTask;

import java.util.ArrayList;
import java.util.HashMap;

public class SuperMarket {
    public static void main(String[] args) {}
        String [] dairy={"Milk","Cheese","Butter","Yougurt","Cream","Casein"};
        String[] chips={"Lays","fritos","Cheetos","Doritos","Ruffles","pringles"};
        String[] cookies={"Nabisco","Oreo","Nestle","Amos","Snackwell","Maryland"};
        double[] dairyPrice={  2.99, 1.99, 3.99, 2.49, 0.99, 1.69};
    double[] chipsPrice={   3.99,  2.99,  4.99,  3.49,  1.99,  2.69};
    double[] cookiesPrice={  4.99,  3.99,  5.99,  4.49,  2.99,  3.69};

    public void Dairy(){
        ArrayList<String> list=new ArrayList<>();
        for(String str:dairy){
            list.add(str);
        }
        System.out.println(list);
    }
    public void Chips(){
        ArrayList<String> list=new ArrayList<>();
        for(String str:chips){
            list.add(str);
        }
        System.out.println(list);
    }
    public void Cookies(){
        ArrayList<String> list=new ArrayList<>();
        for(String str:cookies){
            list.add(str);
        }
        System.out.println(list);
    }
    public void DairyPrice(){
        ArrayList<Double> list=new ArrayList<>();
        for(Double str:dairyPrice){
            list.add(str);
        }
        System.out.println(list);
    }
    public void ChipsPrice(){
        ArrayList<Double> list=new ArrayList<>();
        for(Double str:chipsPrice){
            list.add(str);
        }
        System.out.println(list);
    }
    public void CookiesPrice(){
        ArrayList<Double> list=new ArrayList<>();
        for(Double str:cookiesPrice){
            list.add(str);
        }
        System.out.println(list);
    }
    public void printMapDairy(){
        HashMap<String, Double> mapDairy=new HashMap<>();
        for (int i = 0; i < dairy.length; i++) {
            mapDairy.put(dairy[i],dairyPrice[i]);

        }
        System.out.println(mapDairy);

    }
    public void printMapChips(){
        HashMap<String, Double> mapChips=new HashMap<>();
        for (int i = 0; i < chips.length; i++) {
            mapChips.put(chips[i],chipsPrice[i]);
        }
        System.out.println(mapChips);
    }
    public void printMapCookies(){
        HashMap<String[], double[]> mapCookies=new HashMap<>();
        mapCookies.put(cookies,cookiesPrice);
        System.out.println(mapCookies);
    }
    public HashMap printMap(){
        HashMap<String[],double[]> map=new HashMap();
        map.put(dairy,dairyPrice);
        map.put(chips,chipsPrice);
        map.put(cookies,cookiesPrice);
        return map;
    }
    public void finder(String nameOfItem){
        SuperMarket obj=new SuperMarket();
        obj.printMap().get(nameOfItem);
        System.out.println(obj.printMap().get(nameOfItem));
    }
    public void replacer(String nameOfItem){
        SuperMarket obj=new SuperMarket();
        obj.printMap().replace(nameOfItem,printMap().values(),printMap().get(nameOfItem));
        System.out.println( obj.printMap().replace(nameOfItem,printMap().values(),printMap().get(nameOfItem)));
    }

}
