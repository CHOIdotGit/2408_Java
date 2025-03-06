package oop.enumeration;

public class ExEnum {
//    대부분의 PHP에서는 Enum을 사용하지 않을듯
//    Enum 객체는 상수를 모아서 관리하기 위한 객체이다. 한글로 '열거형'이라 한다.
    public static void main(String[] args) {
//        데이터 타입이 안정성을 가지게 된다.
//        싱글톤 객체
//        한 객체가 메모리에 인스턴스화 -> 다른 곳에서 인스턴스 하지 않고 사용할 수 있음
//        하나 인스턴스화 된 것을 A, B 둘 다 사용할 수 있다. 다만, 라라벨의 엘로퀀트 모델에서 사용하면 데이터가 오염된다.

//        Days day = Days.MONDAY;
        Days day = Days.SATURDAY;
        System.out.println(day);
        System.out.println(day.getDayName());
        System.out.println(day.getDayNum());
//        유저 권한 상수 (등급 관리) - ?
//        궁금증 : 여러 요일을 같이 출력할 수 있을까?
//        여러 요일을 출력하는 것은 상수를 사용하는 목적과 일치하지 않음
    }
}

enum Days {
//    public static final SUNDAY = new Days("일요일");
//    사실은 생성자를 호출하는 코드.
    SUNDAY("일요일", 0)
    ,MONDAY("월요일", 1)
    ,TUESDAY("화요일", 2)
    ,WEDNESDAY("수요일", 3)
    ,THURSDAY("목요일", 4)
    ,FRIDAY("금요일", 5)
    ,SATURDAY("토요일", 6);
//    위와 같이 사용하려면 저장할 공간, 프로퍼티를 만들어 주어야 한다.

    private final String dayName;
    private final int dayNum;

//    파라미터 하나 받는 생성자
    private Days(String dayName, int datNum) {
        this.dayName = dayName;
        this.dayNum = datNum;
    }
//    싱글톤 객체로 만들어 준다. -> 외부에서 enum을 인스턴스화 할 수 없다.

    public String getDayName() {
        return this.dayName;
    }

    public int getDayNum() {
        return this.dayNum;
    }
}