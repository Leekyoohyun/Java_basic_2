package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello","java","jvm","spring","jpa"};
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i].length();
            System.out.println(arr[i].length());
        }
        System.out.println(sum);

    }
}
