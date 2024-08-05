package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,13,30,59);
        System.out.println(dt);

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020); //연도 바꿔서 출력
        System.out.println(changedDt1);

        LocalDateTime changedDt2 = dt.withYear(2020);


    }
}
