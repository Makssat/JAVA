package ExtraExamples;

public class minuteToYearDays {
    public static void main(String[] args) {
        int totalMinute=3456789;
        int yearToDay=365;
        int dayMinute=1440;
        int totalMinuteInYear= yearToDay*dayMinute;
        int totalYear=totalMinute/totalMinuteInYear;
        //System.out.println("Year " +totalMinute/totalMinuteInYear);
        int LeftMinutes=totalMinute-(totalMinute/totalMinuteInYear*totalMinuteInYear);
        //System.out.println(LeftMinutes);
        int totalDay= LeftMinutes/dayMinute;
        //System.out.println(totalDay);
        System.out.println(totalMinute +" minutes is approximately "+ (totalYear)+ " years and "+ totalDay+ " days.");






    }
}
