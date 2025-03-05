package oop.Polymorphism;
// 다형성
public class ExPloymorphism {
    public static void main(String[] args) {
//        오버라이딩, 오버로딩은 다형성의 일종
//        추상 클래스, 인터페이스도 다형성의 일종
//        모든 익셉션은 스로에이블을 구현하고 있음
//        에러 핸들링에서도 사용하고 있었음
        Whale whale1 = new Whale();
        whale1.birth();
        whale1.swimming();
//        다형성으로 인해 에러가 나지 않는다.
//        같은 자료형에 여러가지 타입의 데이터를 대입하여 다양한 결과를 얻어낼 수 있는 성질
        Mammal whale2 = new Whale();
//        자식이 부모의 데이터 타입을 가지는 것을 upCasting이라고 한다.
//        반대는 downCasting이다.
        whale2.birth();
//        whale2.swimming(); // 업캐스팅 되어 자식 클래스의 메소드에 접근할 수 없다.
//        Mammal 기준으로 가지고 있는 메소드만 사용 가능. 자식쪽에 접근 할 수 없음.
//        Whale mammal = new Mammal();
//        mammal로 바로 다운캐스팅하는 것은 불가능하다.
//        업캐스팅한 것을 다운캐스팅할 때 사용할 수 있다.
        Whale mammal = (Whale) whale2;  // 업캐스팅 되었던 것만 다운캐스팅 할 수 있다.

        Mammal[] mammals = {new Whale(), new Whale(), new Squirrel()}; // 현재 배열의 길이를 3개로 초기화 하는 동시에 선언함.

        Whale testWhale = (Whale) mammals[0]; // 다운캐스팅
        testWhale.swimming();

        mammals[0].birth();
        mammals[1].birth();
//        mammals[2].; // 이것은 왜 flying을 사용하지 못하고 birth가 나올까?
//        다운 캐스팅을 하지 않아서 접근하지 못하는 거였음
//        Array List : List 항목을 구현 '''
    }

//    PHP 문법으로 작성
//    public function handler(Throwable $th) {
//        if(instance_of $th == =AuthException) {
//          이와 같이 사용하고 있었기 때문에 PHP에서도 다형성을 사용했다.
//        }
//    }
}

class Mammal {
    public void birth() {
        System.out.println("출산한다.");
    }
}

class Whale extends Mammal {
    public void swimming() {
        System.out.println("수영한다.");
    }
}

class Squirrel extends Mammal {
    public void flying() {
        System.out.println("다람쥐가 날까?");
    }
}