package lambda.start;

import lambda.Procedure;

import java.util.Random;

/**
 * 익명 클래스 사용
 * 자바에서 메서드의 매개변수에 인수로 전달할 수 있는 경우는 크게 2가지이다.
 * int, double, 과 같은 타입
 * 참조형 타입(인스턴스)
 */
public class Ex1RefMainV2 {


    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        // 코드 조각 시작
        procedure.run();
        // 코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("소요 시간: " + (endNs - startNs) + "ns");
    }


    /**
     * 람다를 사용하면 매우 간편하게 코드블럭을 직접 정의하고 전달하는 것을 볼 수 있음
     */
    public static void main(String[] args) {
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 눈: " + randomValue);
        });
        hello(() -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("1부터 100까지의 합: " + sum);
        });
    }
}
