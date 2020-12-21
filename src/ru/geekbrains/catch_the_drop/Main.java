package ru.geekbrains.catch_the_drop;

import java.util.Scanner;

public class Main {

    private static Object Scanner;

    public static void main(String[] args) {
        /* Data type/ */
        byte b = 122;
        short s = 127;
        int a = 234567;
        long l = 6567098;
        float f = 45.7f;
        double d = 45;
        char g = 'g';
        char gj = 'j';
        System.out.println(b);
        System.out.println(s);
        System.out.println(a);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(g);
        System.out.println(gj);

        /* i*(r+(p/e)) */
        float i = 64.14F;
        float r = 56.9F;
        float p = 57.9F;
        float e = 8.5F;
        float result = p / e;
        float result2 = r + result;
        float result3 = i * result2;
        System.out.println(result3);

        /*
        Написать метод, принимающий на вход два целых числа
         и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
         если да – вернуть true, в противном случае – false.
        */

        System.out.println("Введите номер обелиска  ...");
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        System.out.println("Введите номер второго обелиска ...");
        Scanner scanner2 = new Scanner(System.in);
        int z = scanner2.nextInt();
        int sum = v + z;
        if (sum >= 10 && sum <= 20)
            System.out.println("TRU");
        else System.out.println("Fals,");

            /* Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом. 6. Написать метод, которому в качестве параметра
        передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false
        если положительное. */
        System.out.println("Введите число от -1000 до +1000  ");
        Scanner scanner4 = new Scanner(System.in);
        int q = scanner.nextInt();

        if (q >= -1000 && q <= -1)
            System.out.println("Число отрицательное");

        if (q >= 0 && q <= 1000)
            System.out.println("Число положительное");

        System.out.println("Введите 2ое число от -1000 до +1000  ");

        Scanner scanner5 = new Scanner(System.in);

        int w = scanner.nextInt();
        if (w >= -1000 && w <= -1)
            System.out.println("Число отрицательное");

        if (w >= 0 && w <= 1000)
            System.out.println("Число положительное");

        //*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».


        System.out.println("Enter your name...");
        Scanner scanner9 = new Scanner(System.in);
        String name = scanner.next();
        System.out.print ("Hello," + name + "!");







    }
}
