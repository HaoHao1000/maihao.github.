package Exercise1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(23, 59, 59);
        MyTime time2 = new MyTime(2, 59, 26);

        System.out.println("Time1 now: " + time1.toString());
        System.out.println("one second later: " + time1.nextSecond());
        System.out.println("one minute later: " + time1.nextMinute());
        System.out.println("one hour later: " + time1.nextHour());

        System.out.println("Time2 now: " + time2.toString());
        System.out.println("one second later: " + time2.nextSecond());
        System.out.println("one minute later: " + time2.nextMinute());
        System.out.println("one hour later: " + time2.nextHour());


    }
}
