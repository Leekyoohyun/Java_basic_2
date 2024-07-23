package lang.wrapper;

public class WrapperUtillsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); //숫자, 래퍼객체 반환
        Integer i2 = Integer.valueOf("10"); //문자열, 래퍼 객체 반환
        int intValue = Integer.parseInt("10"); //문자열 전용, 기본형 반환

        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = "+ compareResult);
        System.out.println(Integer.sum(10,20));
        System.out.println(Integer.min(10,20));
        System.out.println(Integer.max(10,20));
    }
}
