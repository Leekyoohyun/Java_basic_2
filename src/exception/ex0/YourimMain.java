package exception.ex0;

public class YourimMain {
    public static void main(String[] args) {
        Yourim yourim = new Yourim();
        for(int i=1;i<11;i++){
            System.out.print(i+": ");
            yourim.printYourim();
        }
    }
}
