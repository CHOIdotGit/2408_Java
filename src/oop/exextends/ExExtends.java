package oop.exextends;

public class ExExtends {
    public static void main(String[] args) {
        Whale whale = new Whale("고래", "바다");
        whale.breath();
    }
}

class Mammal {
    protected String name;
    protected String residence;
    protected final int age;
//    final 제어자. 프로퍼티에 붙이면 상수가 된다? 클래스, 메소드에도 붙을 수 있다.
//    class에 final이 있다면 해당 클래스를 상속하는 곳에서 문제가 발생한다.

    //  상수를 정의할 때 선언만 하는 것이 아니라 초기화도 같이 해야 한다.

    public Mammal() {
        this.age = 0;
//        선언 후 바로 초기화 하는 대신 생성자에서 그 값을 초기화 해준다.
    }


    public void breath() {
        System.out.println(this.name + "가 폐호흡합니다.");
//        클래스와 마찬가지로 메소드에 final 키워드가 붙어 있다면 상속받은 곳에서 문제가 발생한다.
    }
}

class Whale extends Mammal {
    public Whale(String name, String residence) {
        this.name = name;
        this.residence = residence;
//        내가 가지고 있지 않지만 내가 상속하고 있는 부모에게서 가져옴
//        부모에서 정의된 메소드를 자식에서 재정의 해서 사용 - 오버라이딩
    }
    @Override // 재정의 하였다면 @Override - 어노테이션(annotation)을 사용한다.
    public void breath() {
        System.out.println("나는 바나나");
//        오버라이딩의 조건은 메소드 명과 파라미터 명이 같아야 한다.
//        또한, 리턴 타입도 동일해야 한다.
    }
}