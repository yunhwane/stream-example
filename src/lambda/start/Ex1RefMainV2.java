package lambda.start;

import lambda.Procedure;

import java.util.Random;

/**
 * 익명 클래스 사용
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


    public static void main(String[] args) {
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 눈: " + randomValue);
            }
        };

        Procedure sum = new Procedure() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                System.out.println("1부터 100까지의 합: " + sum);
            }
        };

        hello(dice);
        hello(sum);
    }
}
