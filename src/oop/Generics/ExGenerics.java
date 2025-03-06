package oop.Generics;

public class ExGenerics {
    public static void main(String[] args) {
//        $responseData = [
//                'success' => true
//                ,'data' => $whale
//                ]; // PHP에서 사용했을 때
        Whale whale = new Whale();

        ResponseDTO<Whale> responseDTO = new ResponseDTO<>(); // 인스턴스, 원래 뒤에서 Whale을 적어야 하지만 지금은 생략 가능하다.
        responseDTO.setMessage("Hello World");
        responseDTO.setSuccess(true);
        responseDTO.setData(whale);

        Hamo hamo = new Hamo();
        ResponseDTO<Hamo> reponseHamo = new ResponseDTO<>();
        reponseHamo.setMessage("Hello World");
        reponseHamo.setSuccess(true);
        reponseHamo.setData(hamo);
    }
}

//@Getter
//@Setter
//스프링에서 위와 같이 어노테이션으로 사용할 수 있다.
//class ResponseDTO<T extends List>  { // 관습으로 T 다음 R을 사용하지만 아무거나 넣어도 동작한다.
class ResponseDTO<T>  { // 제네릭스르 2 ~ 3개를 사용하는 경우는 흔치 않고, 있다고 해도 다른 사람이 만든 라이브러리를 사용할 때다.
    private boolean success;
    private String message;
    private T data; // 제네릭 지정
//    위와 같이 사용하는 이유는 캡슐화 때문이다.
//    객체 안에 들어 있는 여러 프로파티들의 값을 함부로 바꾸거나 해서
//    그 값이 오염되지 않게 하기 위함

//        지역 변수를 설정하지 않는다면 this를 사용하지 않아도
//        자신에게 붙는다.

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class Whale {}
class Hamo {}
class Squirrel {}
