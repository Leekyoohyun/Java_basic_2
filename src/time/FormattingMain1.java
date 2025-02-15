package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포맷팅: 날짜를 문자로
        LocalDate date = LocalDate.of(2024,12,31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);
        System.out.println("포맷팅: "+formattedDate);

        //파싱: 문자를 날짜로
        String input = formattedDate;
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("파싱: "+parsedDate);
    }
}
