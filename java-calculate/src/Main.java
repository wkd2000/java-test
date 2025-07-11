//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Scanner;


        public class Main {

            static double result;
            //더하기
            private double add(double a, double b) {
                return a + b;
            }

            //빼기
            private double minuse(double a, double b) {
                return a - b;
            }

            //곱하기
            private double multiply(double a, double b) {
                return a * b;
            }

            //나누기
            private double divide(double a, double b) {
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                    return 0;
                }
                return a / b;
            }

            //main
            public static void main(String[] args) {
                System.out.println("하실 계산을 골라주세요");
                System.out.println("+. 덧셈");
                System.out.println("-. 뺄셈");
                System.out.println("*. 곱셈");
                System.out.println("/. 나눗셈");

                System.out.print("연산자를 입력하세요 (+, -, *, /): ");
                String choice = "";
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = a;

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = b;


                switch (choice) {
                    case "+": // 덧셈
                        result = (num1 + num2);
                        break;

                    case "-": // 뺄셈
                        result = (num1 - num2);
                        break;

                    case "*": // 곱셈
                        result = (num1 * num2);
                        break;

                    case "/": // 나눗셈
                        result = (num1 / num2);
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다");
                            return;
                        }
                        break;
                }


                System.out.println(result);


            }
        }
