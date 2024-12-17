public class Main {
    public static void main(String[] args) {

        System.out.println("Expected output: 08:09:58");
        Time time1 = new Time(8, 9, 58);
        System.out.println("Actual output: " + time1);
        System.out.println();

        System.out.println("Expected output: 08:09:59");
        time1.tick();
        System.out.println("Actual output: " + time1);
        System.out.println();

        System.out.println("Expected output: 08:10:00");
        time1.tick();
        System.out.println("Actual output: " + time1);
        System.out.println();

        System.out.println("Expected output: 08:10:01");
        time1.tick();
        System.out.println("Actual output: " + time1);
        System.out.println();

        System.out.println("Expected output: 08:10:02");
        time1.tick();
        System.out.println("Actual output: " + time1);
        System.out.println();

        System.out.println("Expected output: 08:10:10");
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println("Actual output: " + time1);
        System.out.println();

        Time time2 = new Time(15, 59, 58);
        System.out.println("Expected output: 15:59:58");
        System.out.println("Actual output: " + time2);
        System.out.println();

        System.out.println("Expected output: 15:59:59");
        time2.tick();
        System.out.println("Actual output: " + time2);
        System.out.println();

        System.out.println("Expected output: 16:00:00");
        time2.tick();
        System.out.println("Actual output: " + time2);
        System.out.println();

        System.out.println("Expected output: 16:00:01");
        time2.tick();
        System.out.println("Actual output: " + time2);
        System.out.println();

        Time time3 = new Time(23, 59, 58);
        System.out.println("Expected output: 23:59:59");
        System.out.println("Actual output: " + time3);
        System.out.println();

        System.out.println("Expected output: 23:59:59");
        time3.tick();
        System.out.println("Actual output: " + time3);
        System.out.println();

        System.out.println("Expected output: 00:00:00");
        time3.tick();
        System.out.println("Actual output: " + time3);
        System.out.println();

        System.out.println("Expected output: 00:00:01");
        time3.tick();
        System.out.println("Actual output: " + time3);
        System.out.println();


        Time time4 = new Time(10, 14, 43);
        System.out.println("Expected output: 10:14:43");
        System.out.println("Actual output: " + time4);
        System.out.println();

        Time time5 = new Time(8, 30, 29);
        System.out.println("Expected output: 18:45:12");
        time4.adjustTime(time5);
        System.out.println("Actual output: " + time4);
        System.out.println();

        System.out.println("Expected output: 08:30:29");
        System.out.println("Actual output: " + time5);
        System.out.println();


        Time time6 = new Time(7, 20, 0);
        System.out.println("Expected output: 02:05:12");
        time4.adjustTime(time6);
        System.out.println("Actual output: " + time4);
    }
}