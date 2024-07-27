package lang.string.test2;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruitsSplit = fruits.split(",");
        System.out.println(fruitsSplit[0]);
        System.out.println(fruitsSplit[1]);
        System.out.println(fruitsSplit[2]);

        String fruitsJoin = String.join("->",fruitsSplit);
        System.out.println(fruitsJoin);
    }
}
