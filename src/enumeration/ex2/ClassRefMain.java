package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = "+ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = "+ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ClassGrade.DIAMOND.getClass());

        System.out.println(ClassGrade.BASIC);
        System.out.println(ClassGrade.GOLD);
        System.out.println(ClassGrade.DIAMOND);
    }
}
