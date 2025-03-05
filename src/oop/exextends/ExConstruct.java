package oop.exextends;

public class ExConstruct {
    public static void main(String[] args) {
//        출력을 하지 않는 작업을 한다면 메인 메소드는 만들지 않아도 된다.
        Whale2 whale2 = new Whale2();
        whale2.print();
    }
}
// 자바의 상속 관계
class Animal {
//    public Animal() {} // 방법 1. 부모에 디폴트 생성자를 만든다.
//    디폴트 생성자를 사용하지 못하는 상태라면 자식쪽에서 정의
    public Animal(int a) {
        System.out.println("Animal");
    }
}

class Mammal2 extends Animal {
    protected String name = "Mammal";
    public Mammal2() {
//        super(); 가 생략되어 있다.
        super(1);
//        자식쪽에서 super(); 메소드를 정의할 때,
//        super(); 메소드가 제일 위에 와야 한다.
        System.out.println("Mammal2");
    }
}

class Whale2 extends Mammal2 {
    protected String name = "Whale2";

    public Whale2() {
//        내부적으로 super(); 라는 메소드가 생략되어 있기 때문에
//        Whale2만 출력하는 것이 아니라 전부 다 출력한다.
//        super(); 메소드는 부모의 디폴트 생성자를 호출하는 메소드이다.
//        디폴트 생성자 : 아무 파라미터도 없는 생성자.
//        파라미터가 없기에 디폴트 생성자를 호출?
        System.out.println("Whale2");
    }

    public void print() {
        String name = "print";
        System.out.println(name); // 지역 변수
        System.out.println(this.name); // 내가 재정의한 것
        System.out.println(super.name); // 부모에 있는 것. 부모에 접근할 때 super
    }
}
//
//
//
//
//
