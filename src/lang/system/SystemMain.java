package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재시간(밀리초)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        //현재시간 나노초
        long currentTimeNano = System.nanoTime();
        System.out.println(currentTimeNano);

        //환경 변수 읽기
        System.out.println("환경변수: "+System.getenv());

        //시스템 속성 읽기
        System.out.println(System.getProperties()); //개많음
        System.out.println(System.getProperty("java.version")); //21.0.1

        //배열을 고속으로 복사
        char[] originalArray = new char[]{'h','e','l','l','o'};
        char[] copiedarray = new char[5];
        System.arraycopy(originalArray,0,copiedarray,0,originalArray.length);

        //배열 출력
        System.out.println(copiedarray);
        System.out.println(Arrays.toString(copiedarray));

        //종료
        System.exit(0);
    }
}
