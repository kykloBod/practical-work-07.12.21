package com.company;


import java.util.Scanner;

public class Main {


    public static double logab(double a, double b) {
        return Math.log(b) / Math.log(a);
    }//вычисляет значение log с нужными параметрами

    public static void main(String[] args) {

        System.out.println("Введите 1 чтобы перейти к элементарным операциям");
        System.out.println("Введите 2 чтобы перейти к триганометрическим операциям");
        System.out.println("Введите 3 чтобы перейти к операциям с log");
        System.out.println("Введите 4 чтобы перейти к операциям над матрицами");
        Scanner scanner = new Scanner(System.in);//импортируем сканер, который будет считывать с консоли
        byte sk = scanner.nextByte();//считываем значение
        //используем тип данных byte для экономии памяти
        if (sk == 1) {//если пользователь ввел 1
            System.out.println("Введите 1 чтобы перейти к сложению");
            System.out.println("Введите 2 чтобы перейти к вычитанию");
            System.out.println("Введите 3 чтобы перейти к умножению");
            System.out.println("Введите 4 чтобы перейти к делению");
            byte eo = scanner.nextByte();//считываем значение сканера элементарных операцый(ео)
            //используем тип данных byte для экономии памяти
            if (eo == 1) {//если пользователь ввел 1
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();//считываем переменную а
                //используем тип данных double для того чтобы охватить больше чисел,все таки у нас калькулятор)
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();//считываем переменную b
                double n = a + b;//используем дополнительную переменную что бы выглядело кресивие
                //хотя для экономии памяти можно было ввывести значение операции сразу
                //при помощи System.out.println(a+b)
                System.out.println("Результат сложения равен: " + n);//выводим результат
            }
            if (eo == 2) {//если пользователь ввел 2
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();//считываем переменную а
                //используем опять переменные a,b и n так как они локальные
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();//считываем переменную b
                double n = a - b;
                System.out.println("Результат вычитания равен: " + n);
            }
            if (eo == 3) {//если пользователь ввел 3
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();//считываем переменную а
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();//считываем переменную b
                double n = a * b;
                System.out.println("Результат умножения равен: " + n);
            }
            if (eo == 4) {//если пользователь ввел 4
                System.out.println("Введите переменную a");
                double a = scanner.nextDouble();//считываем переменную а
                System.out.println("Введите переменную b");
                double b = scanner.nextDouble();//считываем переменную b
                if (b == 0) {//делаем проверку, чтобы знаменатель не был равен нулю
                    System.out.println("Заменатель равен 0");
                    //остонавливаем решение, уведомляя пользователя что на ноль делить плохо)
                } else {
                    double n = a / b;//если знаменатель не равен 0 то продолжаем решенее
                    System.out.println("Результат деления равен: " + n);
                }
            }
        }
    }
}