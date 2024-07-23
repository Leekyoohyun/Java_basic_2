package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // 기본형--> Wrapper
        int value = 7;
        //Integer boxedValue = Integer.valueOf(value);
        Integer boxedValue = value;

        //Wrapper --> 기본형
        //int unboxedValue = boxedValue.intValue();
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = "+boxedValue);
        System.out.println("unboxedValue = "+unboxedValue);
    }
}
