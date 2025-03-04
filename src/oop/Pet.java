package oop;

import oop.pet.Whale;

public class Pet {
//    public은 생략가능 하지만 일반적으로 작성해 둔다.
    public static void main(String[] args) {
        Whale whale = new Whale();
//        10, John
        Whale whale2 = new Whale(20);
//        20, John
        Whale whale3 = new Whale(30, "meerkat");
//        30, meerkat
        whale.swimming();
//        PHP에서 스태틱 메소드는 ::, 인스턴스는 -> 를 사용했었는데,
//        자바에서는 둘 다 점으로 붙는다.
//        잠시 팁. 노란 줄은 워닝(warning)이라서 해결해야 한다.
//        파라미터는 함수를 정의할 때 외부로부터 전달받은 값을 저장하기 위한 변수
//        아규먼트를 저장하기 위한 변수
//        파라미터
//        def cancat(str1, str2):
//          return a +" "+ b
//        다음 cancat 함수 정의에서 str1과 str2는 파라미터.

//        아규먼트
//        cancat("parameter", "argument")
//        cancat 함수를 호출할 때, 입력값 “parameter”와 “argument”는 아규먼트

        int sum = whale.mySum(3, 4);
        System.out.println(sum);
        System.out.println(whale.mySum(1, 2));

        long long1 = 1;
        long long2 = 2;
        long sum2 = whale.mySum(long1, long2);
        System.out.println(sum2);
    }
}
