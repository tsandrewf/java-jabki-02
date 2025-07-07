public class Main {
    public static void main(String[] args) {

        /**
         * примитивы
         */
        int age = 13;
        double wallet = 10.50;
        boolean isSchoolBoy = true;
        char grade = 'A';

        /**
         * Ссылочные типы данных
         */
        String name = "Alice";
        //System.out.println(name.length());

        /**
         * Операторы
         */
        // Арифметические
        int a = 10;
        int b = 3;
        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3 (целочисленное деление)
        System.out.println(a % b); // 1 (остаток от деления)

        // Операторы сравнения
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // true
        System.out.println(a <= b); // false

        // Логические операторы
        boolean x = true;
        boolean y = false;
        System.out.println(x && y); // false
        System.out.println(x || y); // true
        System.out.println(!x); // false

        System.out.println(2 == 2 && 3 != 2); // true
        System.out.println(2 == 2 && 3 != 3); // false
        System.out.println(!((2 + 2) == 4)); // false
        System.out.println(!((2 + 2) == 4) || true); // true

        /**
         * Вывод в консоль
         */
        System.out.println("Привет, мир!");
        System.out.print("А это ");
        System.out.print("будет на одной строке");
        System.out.println();
        System.out.println("А еще " + "можно так " + x);
        System.out.printf("Привет, меня зовут %s и я люблю %s\n", name, "маму");

        int oddNumber = 3;
        System.out.printf("Число четное? %s\n", oddNumber % 2 == 0);

        System.out.println("* * *");
        System.out.println("*   *");
        System.out.println("* * *");

        /**
         * Комментарии
         */

        // Однострочный комментарий
        // вторая строка

        /*
        многострочный
        комментарий
         */

        /**
         * Складывает два числа
         *
         * @param a первое число
         * @param b второе число
         * @return сумму чисел a и b
         */

        /**
         * Условные операторы
         * if-else
         */

        boolean isRain = true;
        /*
        if (isRain) {
            System.out.println("Надеть куртку");
            System.out.println("Надеть обувь");
            System.out.println("Взять зонт");
        } else {
            System.out.println("Надеть куртку");
            System.out.println("Надеть обувь");
        }
         */

        System.out.println("Надеть куртку");
        System.out.println("Надеть обувь");
        if (isRain) {
            System.out.println("Взять зонт");
        }

        String animal = "fish";
        if (animal.equals("cat")) {
            System.out.println("Маяу");
        } else if (animal.equals("dog")) {
            System.out.println("Гав");
        } else {
            System.out.println("Буль");
        }

        int floor = 1;
        double price = 3000;
        if (floor == 1 && price < 5000) {
            System.out.println("Подходит для аренда");
        }

        a = 0;
        String result = a > 0 ? "a положительное число" : "а отрицательное число";
        System.out.println(result);

        switch (animal) {
            case "cat":
                System.out.println("Мяу");
                break;
            case "dog":
                System.out.println("Гав");
                break;
            case "fish":
                System.out.println("Буль!");
                break;
            case "bear":
                System.out.println("рр");
                break;
            default:
                System.out.println("Привет!");
        }

        /**
         * Циклы
         */

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while
        int z = 0;
        while (z < 10) {
            System.out.println(z);
            z++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Выход из цикла
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // пропуск
            }
            System.out.println(i);
        }

        // Домашнее задание #02
        System.out.println();
        System.out.println("Домашнее задание #02");

        // Определение площади круга
        {
            double radius = 10.0;
            double circleArea = Math.PI * radius * radius;
            System.out.printf("Площадь круга радиусом %s: %s", radius, circleArea);
            System.out.println();
        }

        // Перевод температуры из Цельсия в Фаренгейт
        {
            double tmpCelsius = 20.0;
            double tmpFahrenheit = tmpCelsius * 9.0 / 5.0 + 32.0;
            System.out.printf("Температура %sC соответствует %sF", tmpCelsius, tmpFahrenheit);
            System.out.println();
        }

        // Сравнение длин 2-х строк
        {
            String line1 = "Первая строка", line2 = "Вторая строка";
            System.out.printf("Длина 1-й строки (\"%s\") %s 2-й строки (\"%s\")", line1, (line1.length() > line2.length() ? "больше длины" : (line2.length() > line1.length()) ? "меньше длины" : "равна длине"), line2);
            System.out.println();
        }

        // Определяем, является ли год високосным
        {
            int year = 2025;
            boolean isYearLeap = ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
            System.out.printf("Год %s %s является високосным", year, (!isYearLeap ? "не" : ""));
            System.out.println();
        }

        // Определяем индекс массы тела (Body Mass Index - bmi)
        {
            double weight = 81.0, height = 1.82;
            double bodyMassIndex = weight / height;
            String conclusion;

            if (bodyMassIndex <= 16.0) {
                conclusion = "Выраженный дефицит массы тела";
            } else if (bodyMassIndex <= 25.0) {
                conclusion = "Норма";
            } else if (bodyMassIndex <= 30.0) {
                conclusion = "Избыточная масса тела (предожирение)";
            } else if (bodyMassIndex <= 35.0) {
                conclusion = "Ожирение 1 степени";
            } else if (bodyMassIndex <= 40.0) {
                conclusion = "Ожирение 2 степени";
            } else {
                conclusion = "Ожирение 3 степени";
            }
            System.out.printf("Индекс массы тела %s при весе %sкг и росте %sм: %s", bodyMassIndex, weight, height, conclusion.toLowerCase());
            System.out.println();
        }

        // Вывод в консоль таблицы истинности для операторов && и ||
        {
            boolean b1, b2;
            System.out.println("b1\t\tb2\t\tb1&&b2\tb1||b2");

            b1 = false;
            b2 = false;
            System.out.println(b1 + "\t" + b2 + "\t" + (b1 && b2) + "\t" + (b1 || b2));

            b1 = true;
            b2 = false;
            System.out.println(b1 + "\t" + b2 + "\t" + (b1 && b2) + "\t" + (b1 || b2));

            b1 = false;
            b2 = true;
            System.out.println(b1 + "\t" + b2 + "\t" + (b1 && b2) + "\t" + (b1 || b2));

            b1 = true;
            b2 = true;
            System.out.println(b1 + "\t" + b2 + "\t" + (b1 && b2) + "\t" + (b1 || b2));
        }

        // Вывод в консоль квадрата
        {
            System.out.println("Заполненный квадрат");
            int height = 5, width = height * 10  / 4;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Вывод в консоль полого квадрата
        {
            System.out.println("Полый квадрат");
            int height = 5, width = height * 10  / 4;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i == 0) || (i == height - 1) || (j == 0 || j == width -1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}