package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    //필요한 경우는 예외를 잡아서 처리하면 된다
    public void callCatch(){
        try{
            client.call();
        }catch (MyUncheckedException e){
            //예외처리 로직
            System.out.println("예외처리, message = "+e.getMessage());
        }
        System.out.println("정상 로직");
    }

    //예외를 잡지 않아도 됨.
    //자연스럽게 상위로 넘어감, throws예외 선언 필요없음
    public void callThrow(){
        client.call();
    }
}
