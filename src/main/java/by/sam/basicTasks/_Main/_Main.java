package by.sam.basicTasks._Main;

import javax.swing.text.html.parser.Parser;

public class _Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
    }

    /* объявить 2 переменных типа int,
    проинициализировать их прямо в коде.
    Затем поменять местами значения в переменных без использования литералов,
    но с использованием дополнительной переменной.*/
    public static void task1() {
        System.out.println("task1");
        int x = 1;
        int y = 2;
        int tmp = x;
        x = y;
        y = tmp;
        System.out.println("x=" + x + " y=" + y);
        System.out.println();
    }

    /* Выполнить задание из пункта 1, но без использования дополнительной переменной. */
    public static void task2() {
        System.out.println("task2");
        int x = 1;
        int y = 2;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x=" + x + " y=" + y);
        System.out.println();
    }

    /*Объявить переменную x типа float и проинициализировать
    её значением прямо в коде. Объявить переменную y типа Integer
    и присвоить ей значение из переменной x без использования вызовов методов какого-либо класса.*/
    public static void task3() {
        System.out.println("task3");
        float x = 1.123568468f;
        int y = (int) x;
        System.out.println(y);
        System.out.println();
    }

    /*Создать в методе две строки “abc” и “abc” в переменных String str1 и String str2 так,
    чтобы выражение str1 == str2 возвращало false.*/
    public static void task4() {
        System.out.println("task4");
        String str1 = "abc";
        String str2 = "abc";
        StringBuilder s = new StringBuilder(str2);
        str2 = s.toString();

        System.out.println(str1 + " " + str2 + " " + (str1 == str2));
        System.out.println();
        // Второй вариант
        String str3 = new String("abc");
        String str4 = "abc";
    }

    /*Создать в методе две переменных Integer num1 и
    Integer num2 со значениями 5 и 5 так, чтобы выражение num1 == num2 возвращало false.*/
    public static void task5() {
        System.out.println("task5");
        Integer num1 = new Integer(5);
        Integer num2 = new Integer(5);
        System.out.println("num1=" + num1 + " num2=" + num2 + " " + (num1 == num2));
        System.out.println();

        // Второй вариант
        Integer num3 = 5;
        Integer num4 = new Integer(5);

    }

    /*Используя тернарный оператор и System.out.println() сравнить 2 числа и
    распечатать true или false. Все это необходимо реализовать в одну строку кода внутри метода.*/
    public static void task6() {
        System.out.println("task6");
        System.out.println(5 > 3);
        System.out.println(5 < 3 ? true : false);
        System.out.println();
    }

    /*Объявить в методе переменную int x и сразу проинициализировать её значением 5.
    Следующей строкой кода сначала вывести значение переменной в терминал,
    а затем уменьшить значение переменной на 1. (то есть внутри метода должно быть 2 строки кода всего)*/
    public static void task7() {
        System.out.println("task7");
        int x = 5;
        System.out.println(x--);
        System.out.println();
    }

    /*Объявить в методе переменную int x и сразу проинициализировать её значением 7.
    Следующей строкой кода сначала увеличить значение переменной на 1,
    а затем вывести его в терминал (то есть внутри метода должно быть 2 строки кода всего)*/
    public static void task8() {
        System.out.println("task8");
        int x = 7;
        System.out.println(++x);
        System.out.println();
    }

    /*Объявить переменную char sign в методе и проинициализировать её значением ‘a’.
    Используя цикл while и переменную sign вывести в терминал все буквы английского алфавита от а по z.*/
    public static void task9() {
        System.out.println("task9");
        char sign = 'a';
        String str1 = "";
        while (sign <= 'z') {
            str1 = str1 + " " + sign;
            sign++;
        }
        System.out.println(str1);
        System.out.println();
    }
        /* Второй способ
        while (sign <= 122) {
            System.out.println(sign + " ");
            sign++;
        }
         */

    /*Реализовать в методе цикл while(true), (цикл, у которого в условии написано true)
    который распечатывает числа только от 1 до 5.*/
    public static void task10() {
        System.out.println("task10");
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 5) break;
        }
        System.out.println();
    }

    //Определить количество всех трёхзначных чисел, кратных 7 и также сумма цифр которых кратна 7.
    public static void task11() {
        System.out.println("task11");
        int counter = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 7 == 0) {
                String s = String.valueOf(i);
                if ((Integer.parseInt(s.substring(0, 1)) + Integer.parseInt(s.substring(1, 2)) + Integer.parseInt(s.substring(2))) % 7 == 0) {
                    counter++;
                    System.out.println(i);
                }
            }
        }
        System.out.println("Количество: " + counter);
        System.out.println();
    }
    /*Второй способ
    int x = 100;
        int counter = 0;
        while (x <= 999) {
            if (x % 7 == 0) {
                int digitSum = 0;
                int num = x;
                while (num > 0) {
                    digitSum = digitSum + num % 10;
                    num = num / 10;
                }
                if (digitSum % 7 == 0) {
                    counter++;
                }
                x++;
            }
        }
     */

    /*Создать в методе переменную String str и проинициализировать её значением:
    «Dorothy lived in the midst of the great Kansas prairies, with Uncle Henry,
    who was a farmer, and Aunt Em, who was the farmer's wife.»
    Написать в методе код, который посчитает количество слов в этом предложении.
    (код должен сработать для любого предложения, с любым количеством слов, а не только этого).
    запрещено использование методов типа split*/
    public static void task12() {
        System.out.println("task12");
        String str1 = "Dorothy lived in the midst of the great Kansas prairies, with Uncle Henry, who was a farmer, and Aunt Em, who was a farmer's wife.";
        str1 = str1.replaceAll("[^ ]", "");
        System.out.println(str1.length());
    }
    /*Второй способ
    String str = "Dorothy lived in the midst of the great Kansas prairies, with Uncle Henry, " +
                "who was a farmer, and Aunt Em, who was the farmer's wife.";
        int index = 0;
        int strSize = str.length();
        int counter = 0;
        while (index < strSize) {
            if (str.charAt(index) == ' ') {
                counter++;
            }
            index++;
        }
        System.out.println(++counter);
     */

    //Написать в методе код, который заполняет массив из 10 элементов числами фибоначчи, начиная с начала ряда.
    public static void task13() {

    }

    /*Создать массив и заполнить его в цикле while заглавными
    буквами английского алфавита без использования ввода с клавиатуры.*/
    public static void task14() {

    }

    /*Создать массив типа float и размера 20.
    Проинициализировать его в цикле случайными значениями  в диапазоне от 163.0 до 197.0 (не включая 197).*/
    public static void task15() {

    }

    public static void task16() {

    }

    public static void task17() {

    }

    public static void task18() {

    }

    public static void task19() {

    }

    public static void task20() {

    }

    public static void task21() {

    }

    public static void task22() {

    }
}
