package staticVar;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("April");
        System.out.println("April count = "+data1.count);

        Data1 data2 = new Data1("May");
        System.out.println("May count = "+data2.count);
    }
}
