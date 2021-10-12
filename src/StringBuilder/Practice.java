package StringBuilder;

public class Practice {
    public static void main(String[] args) {
        String test="Test";
       test.concat(" is coming with Selenium Web Driver");
      // test.substring(test.indexOf("S"));
        test.concat(" is coming tool");
        System.out.println(test);
        StringBuilder builder=new StringBuilder();
        StringBuilder build= new StringBuilder("Test");
        System.out.println(build);
        builder.append("Test number 1");
        builder.reverse();
        System.out.println(build.reverse());
    }
}
