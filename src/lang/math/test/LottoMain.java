package lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        LottoGenerator lott = new LottoGenerator();

        int[] lottoNumbers = lott.generate();

        System.out.print("로또 번호: ");
        for(int lottoNumber: lottoNumbers){
            System.out.print(lottoNumber+" ");
        }
    }
}
