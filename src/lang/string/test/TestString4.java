package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        //hello와 .txt 분리하기
        System.out.println("filename = "+str.substring(0,5));
        System.out.println("extName = "+str.substring(5));
    }
}
