package oop.pet;

public class Whale {
//    public
//    private
//    protected
//    default 디폴트는 생략가능하지만 해당 클래스 안에서만 사용할 수 있다.
//    int age; // 같은 패키지에 소속된 클래스에서 접근 할 수 있다.
//    public static String name; // 클래스 변수(?)
    private int age; // 인스턴스 변수
    private String name; // 인스턴스 변수

//    생성자(메소드)
//    생성자도 오버로딩이 된다.
//    클래스가 인스턴스화 할 때 최초 딱 한 번 실행되는 메소드
    public Whale() {
        this(10); // 나의 생성자에게 붙는다.
    }
//    파라미터가 없는 생성자는 파라미터가 1개인 생성자를 호출
    public Whale(int age) {
//        this.age = age;
//        this.name = "Whale";
        this(age, "John");
//        this는 내가 가지고 있는 것을 사용할 때 사용한다. PHP와 유사?하거나 같다.
    }
//    파라미터가 1개인 생성자는 파라미터 2개인 생성자를 호출
    public Whale(int age, String name) {
        this.age = age;
        this.name = name;
    }

//    메소드
    public void swimming() {
//    public int swimming() {
//    public String swimming() {
//    void는 리턴할 타입이 없을 때 사용할 수 있다.
        String test = "test"; // 지역 변수
        System.out.println("Swimming");
    }
    public int mySum(int a) {
        return a + 1;
    }
    public int mySum(int a, int b) {
        return a + b;
//      메소드 시그니처가 다른 경우 오버로드로 다른 타입을 사용할 수 있다?
//        메소드 시그니처는 데이터 타입이 아닌 메소드 선언 부분에만 해당된다.
    }
    public long mySum(long a, long b) {
        return a + b;
        //        오버로딩을 통해 파라미터만 바꾸면 똑같은 메소드를 사용할 수 있다?
//        PHP에서는 오버리딩 밖에 없는데 자바는 둘 다 가지고 있음.
//        println은 모든 타입을 출력할 수 있음.
    }
}
