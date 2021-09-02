package String;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Aksat23";
        System.out.println(name.indexOf("A"));//it will print index number of "A"
        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf("23"));//it looks matching sequence of char and will return first index
        System.out.println("145");//-1 there is no matching char sequence
        name.concat(" Adgi");
        System.out.println(name);//will print only Aksat23
        name=name.concat(" IS string");
        System.out.println(name);
        name.indexOf("s",6);//will start from after index 6
        name=name.concat(" 123");
        name="Arzu beril Sen";
        System.out.println(name.indexOf("S",name.indexOf(" ")+2));
       // String name1="hello";
        //System.out.println(name1+"hello");
        //System.out.println(name1);
        //name.indexOf()//the value u put inside paranthesis called "parameter"
        System.out.println(name.length());

    }
}
