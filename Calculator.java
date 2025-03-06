package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> history;


    public Calculator() {
        this.history = new ArrayList<>();
    }


    public int calculate(int num1, char operator, int num2) {
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }


        history.add(result);
        return result;
    }

    public List<Integer> getHistory() {
        return new ArrayList<>(history);
    }
}
