package enumeration.ex3;

import lang.object.Parent;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class A = "+Grade.A.getClass());
        System.out.println("class B = "+Grade.B.getClass());
        System.out.println("class C = "+Grade.C.getClass());
        System.out.println("class D = "+Grade.D.getClass());
        System.out.println("class F = "+Grade.F.getClass());

        System.out.println("ref A = "+refValue(Grade.A));
        System.out.println("ref B = "+refValue(Grade.B));
        System.out.println("ref C = "+refValue(Grade.C));
        System.out.println("ref D = "+refValue(Grade.D));
        System.out.println("ref F = "+refValue(Grade.F));
    }

    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
