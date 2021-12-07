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
        if (sk == 2) {//если пользователь ввел 2
            System.out.println("Введите 1 чтобы вычислить sin x");
            System.out.println("Введите 2 чтобы вычислить cos x");
            System.out.println("Введите 3 чтобы вычислить tan x");
            System.out.println("Введите 4 чтобы вычислить ctg x");
            System.out.println("Введите 5 чтобы вычислить sin 2x");

            byte tr = scanner.nextByte();//считываем значение сканера триганометрических операцый(tr)
            //используем тип данных byte для экономии памяти
            if (tr == 1) {//если пользователь ввел 1
                System.out.println("Введите x");
                double x = scanner.nextDouble();//считываем значение х
                double n = Math.sin(x);//опять же использую переменную n для красоты
                //для экономии памяти этого делать не следует
                System.out.println("Значение x: " + n);
            }
            if (tr == 2) {//если пользователь ввел 2
                System.out.println("Введите x");
                double x = scanner.nextDouble();//считываем значение х
                //как и до этого использую одни и те же локальные переменные n и х
                double n = Math.cos(x);
                System.out.println("Значение x: " + n);
            }
            if (tr == 3) {//если пользователь ввел 3
                System.out.println("Введите x");
                double x = scanner.nextDouble();//считываем значение х
                double n = Math.tan(x);
                System.out.println("Значение x: " + n);
            }
            if (tr == 4) {//если пользователь ввел 4
                System.out.println("Введите x");
                double x = scanner.nextDouble();//считываем значение х
                double n = Math.cos(x) / Math.sin(x);
                //т.к. функции ctg в Math нет используем алгебраический смысл этой функции
                System.out.println("Значение x: " + n);
            }
            if (tr == 5) {//если пользователь ввел 5
                System.out.println("Введите x, sin x");
                double x = scanner.nextDouble();//считываем значение х
                System.out.println("Введите t, cos t");
                double t = scanner.nextDouble();//считываем значение t
                double n = 2 * (Math.sin(x)) * (Math.cos(t));
                System.out.println("sin 2x: " + n);
            }
            if (tr == 6) {//если пользователь ввел 6
                System.out.println("Введите x, sin x");
                double x = scanner.nextDouble();//считываем значение х
                System.out.println("Введите t, cos t");
                double t = scanner.nextDouble();//считываем значение t
                double n = Math.pow(Math.cos(t), 2) - Math.pow(Math.sin(x), 2);
                System.out.println("cos 2x: " + n);
            }
        }
        if (sk == 3) {//если пользователь ввел 3
            System.out.println("Введите 1 чтобы вычислить log a по основанию b");
            System.out.println("Введите 2 чтобы вычислить log b*c по основанию a");
            System.out.println("Введите 3 чтобы вычислить log b/a по основанию a");
            byte lg = scanner.nextByte();
            if (lg == 1) {//если пользователь ввел 1
                System.out.println("Введите а");
                System.out.println("Введите b");
                double a = scanner.nextDouble();//считываем a,b
                double b = scanner.nextDouble();
                double n = logab(b, a);//написал маленький метод для log
                System.out.println(" log a по основанию b: " + n);
            }
            if (lg == 2) {//если пользователь ввел 2
                System.out.println("Введите а");
                System.out.println("Введите b");
                System.out.println("Введите c");
                double a = scanner.nextDouble();//считываем a,b,с
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double n = (logab(b, a)) + (logab(c, a));//вызываем метод
                System.out.println("log b*c по основанию a: " + n);
            }
            if (lg == 3) {//если пользователь ввел 3
                System.out.println("Введите а");
                System.out.println("Введите b");
                System.out.println("Введите c");
                double a = scanner.nextDouble();//считываем a,b,с
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double n = (logab(b, a)) - (logab(c, a));
                System.out.println("log b/c по основанию a: " + n);
            }
        }
        if (sk == 4) {//если пользователь ввел 4
            Scanner str = new Scanner(System.in);//импортируем сканер
            System.out.println("Введите количество строк в матрице: ");
            int n = str.nextInt();//Считываем количество строк n
            System.out.println("Введите количество столбцов в матрице: ");
            int m = str.nextInt();//Считываем количество столбцов m
            int[][] arr = new int[n][m];//n - количество строк, m - столбцов
            System.out.println("Введите элементы мастрицы(программма заполняет с лева на право построчно ");
            for (int i = 0; i < n; i++) {//Внешний цыкл заполняет строки
                for (int j = 0; j < m; j++)//Внутренний цыкл заполняет столбцы
                    arr[i][j] = str.nextInt();
            }//for для строк
            System.out.println("Начальная матрица");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%10d", arr[i][j]);//вывод массива
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int matrix = arr[i][j];//запоминаем рабочий элемент в переменную matrix
                    arr[i][j] = arr[j][i];// меняем местами элементы матрицы
                    arr[j][i] = matrix;//присваевам переменной matrix значение после транспонирования
                }
            }
            System.out.println("Транспонированная матрица");
            System.out.println();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%10d", arr[i][j]);//вывод транспонированной матрицы
                }
                System.out.println();
            }


        }

    }
}