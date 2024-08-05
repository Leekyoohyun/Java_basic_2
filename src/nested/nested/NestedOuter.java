package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3; //바깥 클래스의 클래스 멤버
    private int outInstanceValue =2; //바깥 클래스의 인스턴스 멤버

    static class Nested{
        private int nestedInstanceValue =1;

        public void print(){
            System.out.println(nestedInstanceValue);

            System.out.println(NestedOuter.outClassValue);
        }
    }
}
