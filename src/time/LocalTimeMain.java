package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(13,10,5);

        System.out.println(nowTime);
        System.out.println(ofTime);
    }
}
