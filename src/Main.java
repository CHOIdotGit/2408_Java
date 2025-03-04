import java.util.Arrays;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        변수
//        기본 타입
//        int age = 29;
////        int값을 가질 수 있는 a라는 변수 명
////        선언과 초기화의 차이
////        선언 : 특정 값을 메모리에 저장할 수 있는 것 예시) int a;
////        초기화 : 디폴트 값 삽입. 예시) int a = 9;
////        age를 30으로 변경
//        age = 30;
//        char gender = 'M';
//        String name = "John"; // String은 객체이며 대문자로 시작한다. 참조형 변수. 쌍따옴표로 문자를 감싸줘야 한다.
//        boolean married = false;
//        float avgAge = 52.1f;
//        double avgAge2 = 52.1; // 더블의 d는 생략 가능
//
//        byte max = 127;
//        byte min = -128;
//        byte sum = (byte) (max + 1);
//        System.out.println(sum);
//
////        실수형의 표현? 오차
////        float와 double중 double이 용량이 더 크며 더 정확하다
////        다른 말로 표현의 오차가 적다.
//        double a = 0.1;
//        double b = 0.2;
//        System.out.println(a + b);
////        0.30000000000000004
//        System.out.println((a*10 + b*10)/10);
////        0.3
//
////        sout + tab 버튼
//        float c = 0.1f;
//        float d = 0.2f;
//        System.out.println(c + d);
////        0.3
////        왜 이런 차이가 나는 걸까?
////        BigDecimal bd = new BigDecimal(a);
//        BigDecimal bd = new BigDecimal("0.1");
////        BigDecimal bd2 = new BigDecimal(b);
//        BigDecimal bd2 = new BigDecimal("0.2");
//        BigDecimal bsum = bd.add(bd2);
//        System.out.println(bsum);
////        0.3

//        연산자
//        자바는 기본적으로 완전 비교한다.
//        System.out.println(1 == 1);
//        System.out.println(1 != 1);
//        System.out.println("a" == 1); // 이와같은 비교는 하지 못한다.
        String A = "Hello World";
        String B = "Hello World";
//        A는 메모리에 새로 하나 만들고 B는 이미 만들어진 A를 사용하게 된다.
//        그래서 A와 B가 같다고 나타나게 된다.
//        String A = new String("Hello World");
//        String B = new String("Hello World");
//        위와 같이 사용한다면 false가 나온다.
        System.out.println(A == B);
//        true
        System.out.println(A.equals(B)); // 스트링 비교
//        true // 문자열의 비교는 비교연선자 equals를 사용해야 한다.

//        if문 - php와 똑같다.
//        for문 - php와 약간 다르다.
        for(int i = 1; i <= 5; i++) {
//            if(i == 3) {
            if(i != 3) {
                continue;
            }
            System.out.println(i);
        }
//        1 ~ 100중 3과 7의 배수만 출력
        for(int j = 1; j <= 100; j++) {
            if(j % 3 == 0 || j % 7 == 0) {
                System.out.println(j);
            }
        }

//        배열
//        PHP에서 배열은 hash table + Array이다.
//        속도가 느리며, iterable하지 않고 문자, 숫자, 객체등 다 담을 수 있었는데,
//        다른 언어에서 보자면 이단이다.
//        일반적인 배열은 순서(iterable)를 가지며, 원래 배열은 처음 선언할 때 고정된 길이를 가진다.
//        또한, int 배열은 int만 exception 객체는 exception만 들어간다.
//        모든 데이터 타입이 동일하다.

//        배열 선언
//        int[] arrInt = new int[10]; // 여기의 숫자는 배열의 길이를 의미한다. 10개의 방을 가진 int배열이다.
//        대신 콜랙션? 이 있는데 배열의 리스트를 사용한다??
        int[] arrInt = {1, 2, 3, 4, 5};
        String[] arrString = {"A", "B", "C", "D", "E", "F"};
//        초기화 할 때, 내가 값을 넣고 싶다면 대괄호가 아닌 중괄호를 사용해야 한다.
//        arrInt[0] = 45;
//        arrInt[1] = "45";
//        자바에서 데이터 타입을 설정했을 때, 꼭 그 값만 넣을 수 있다.
//        int[] arrInt2 = arrInt;
//        int[] arrInt2 = new int[arrInt.length * 2];
        int[] arrInt2 = Arrays.copyOf(arrInt, arrInt.length);
//        arrInt2 = Arrays.copyOf(arrInt, arrInt.length); // 파리미터 2개. 복사할 배열, 복사할 배열의 길이 << 굳이 이렇게 하지 않아도 됨
        arrInt2[0] = 100;
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrInt2));
//        위와 같이 자바는 배열이 참조형으로 사용되어 PHP처럼 복사해오는 것이 아니라 참조하여 arrInt의 값이 변질된다.
//        그래서 arrInt가 가지고 있는 값 자체를 복사해서 사용한다.
//        PHP와 같이 변수를 바꾸기 전에 출력하면 그 값이 적용되지 않는다.
    }
}
