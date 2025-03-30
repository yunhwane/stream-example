package lambda.start;

import java.util.Random;

public class Ex1Main {


    /**
     * 주사위 눈을 랜덤으로 생성하여 출력하는 메서드
     * 소요 시간을 측정하여 출력
     * 주사위 눈은 1부터 6까지의 정수
     * 소요 시간은 나노초 단위로 측정
     */
    public static void helloDice() {
        long startNs = System.nanoTime();

        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 눈: " + randomValue);
        // 코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("소요 시간: " + (endNs - startNs) + "ns");
    }

    /**
     * 1부터 100까지의 합을 구하는 메서드
     * 소요 시간을 측정하여 출력
     * 소요 시간은 나노초 단위로 측정
     */
    public static void helloSum() {
        long startNs = System.nanoTime();

        // 코드 조각 시작
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합: " + sum);
        // 코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("소요 시간: " + (endNs - startNs) + "ns");
    }

    /**
     *
     * 이 코드를 이전에 리팩토링 한 예와 같이 하나의 메서드에서 실행 할 수 있도록 리팩토링해보자.
     */
    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
