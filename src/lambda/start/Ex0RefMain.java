package lambda.start;



public class Ex0RefMain {

    private static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println(str); // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    /**
     변하지 않는 부분과 변하는 부분을 확인하여 메서드로 외부로 전달 받아서 처리한다.
     프로그래밍에서 중복을 제거하고 좋은 코드를 유지하는 핵심은 변하는 부분과 변하지 않는 부분을 분리하는 것이 가장 큰 핵심이다.
     value parameterization
     */
    public static void main(String[] args) {
        hello("Hello, Java!");
        hello("Hello, Spring!");
    }
}
