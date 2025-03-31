package lambda.lambda1;

import lambda.Procedure;

public class ProcedureMain2 {

    public static void main(String[] args) {

        // Procedure 인터페이스를 구현한 익명 클래스
        Procedure procedure = () -> {
                System.out.println("Hello, lambda!");
        };

        procedure.run();
    }
}
