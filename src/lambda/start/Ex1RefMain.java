package lambda.start;

import lambda.Procedure;

import java.util.Random;

public class Ex1RefMain {


    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        // 코드 조각 시작
        procedure.run();
        // 코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("소요 시간: " + (endNs - startNs) + "ns");
    }

    static class Dice implements Procedure {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 눈: " + randomValue);
        }

    }

    static class Sum implements Procedure {
        @Override
        public void run() {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("1부터 100까지의 합: " + sum);
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

    /**
     * 어떻게 메서드를 전달 할 수 있을까?
     * 자바는 인스턴스를 전달하고 인스턴스에 구현되어 있는 메서드를 호출하는 식으로 리팩토링을 진행했다.
     * 이것을 동작 매개변수화 (Behavior Parameterization)라고 한다.
     */
}
