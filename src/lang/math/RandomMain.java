package lang.math;
import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        int randomInt2 = random.nextInt(10); //범위 0~10
        System.out.println(randomInt2);

        int randomInt3 = random.nextInt(10)+1; // 1~10
        System.out.println(randomInt3);
    }
}
