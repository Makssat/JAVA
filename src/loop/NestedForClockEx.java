package loop;

public class NestedForClockEx {
    public static void main(String[] args) {
        for(int hour=0;hour<12;hour++){
            if(hour==5||hour==6||hour==7){
                continue;
            }
            if(hour>=10){
                break;
            }
            for(int min=0;min<60;min++){
                System.out.println(hour+" hour "+min+" minute");
            }
        }
    }
}
