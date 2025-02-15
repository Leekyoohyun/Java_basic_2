package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex0.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC,price);
        int gold = discountService.discount(StringGrade.GOLD,price);
        int diamond = discountService.discount(StringGrade.DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}
