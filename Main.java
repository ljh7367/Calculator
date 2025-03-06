package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            try {

                int result = calculator.calculate(num1, operator, num2);
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }


            System.out.print("더 계산하시겠습니까? (yes 입력 시 계속 진행, exit 입력 시 종료): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("exit")) {
                System.out.println("계산을 종료합니다.");
                break;
            }
        }

        System.out.println("계산 기록: " + calculator.getHistory());
        scanner.close();
    }
}
