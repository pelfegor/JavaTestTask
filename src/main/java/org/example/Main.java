package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите арифметическое выражение: ");
        String inputText = scanner.nextLine();
        System.out.printf(calc(inputText));


    }

    public static String calc(String input) throws Exception {
        String result = "Произошла ошибка, попробуйте снова";
        int firstNumber;
        int secondNumber;
        String mathSymbol;
            String[] strings = input.split(" ");
            if(strings.length<=1) {
                throw new Exception("Строка не является математической операцией, просьба соблюдать следующую формулу: \na + b \na - b \na * b \na / b \n,где 'a' и 'b' ваши числа");
            } else if (strings.length>3) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда(цифрами) и один оператор (+, -, /, *)");

            }
            try {
                firstNumber = Integer.parseInt(strings[0]);
                secondNumber = Integer.parseInt(strings[2]);
                mathSymbol = strings[1];
            }
            catch (Exception e){
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда(цифрами) и один оператор (+, -, /, *)");
            }


        if (firstNumber > 10 || secondNumber > 10) {
            System.out.println("Вводимое число не может быть больше 10");
        } else {
            switch (mathSymbol) {
                case "+":
                    result = String.valueOf(firstNumber + secondNumber);
                    break;
                case "-":
                    result = String.valueOf(firstNumber - secondNumber);
                    break;
                case "*":
                    result = String.valueOf(firstNumber * secondNumber);
                    break;
                case "/":
                    result = String.valueOf(firstNumber / secondNumber);
                    break;
            }
        }

        return result;
    }
}