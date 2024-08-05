package staticVar;

public class DataCountMain2 {
    public static void main(String[] args) {
        Data2 data2 = new Data2("April");
        System.out.println("April count = "+Data2.count);

        Data2 data3 = new Data2("May");
        System.out.println("May count = "+Data2.count);
    }
}
