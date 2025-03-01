package org.example.dom1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {

            try {
                double number = calculateSquareRoot(9.0);
                System.out.println("Ответ = " + number);
            } catch (NegativeNumberException e) {
                System.out.println("Нельзя вычислить квадратный корень отрицательного числа " + e.getNumber());
            }

        }
        public static double calculateSquareRoot(double number) throws NegativeNumberException {
            if (number < 0) {
                throw new NegativeNumberException(number);
            }
            return Math.sqrt(number);
        }
    }