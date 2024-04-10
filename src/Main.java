import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
        //task11();
        //task12();
    }


        public static void task1(){
//        Завдання 1:
//        Вивести на екран надпис "Your time is limited, so don’t waste it living someone else’s life" Steve Jobs
//        в різних рядках. Приклад виводу:
//                    “Your time is limited,
//                            so don’t waste it
//                                living someone else’s life”
//                                            Steve Jobs


            String text = """
                Your time is limited,
                         so don’t waste it
                                    living someone else’s life
                                              Steve Jobs""";

            System.out.println("Завдання 1:");
            System.out.println(text);
        }

        public static void task2(){
//        Завдання 2:
//      Користувач вводить з клавіатури два числа. Перше число — це значення, друге число — відсоток,
//      який необхідно підрахувати. Наприклад, ми ввели з клавіатури 50 і 10. Потрібно вивести на екран
//      10 відсотків від 50. Результат — 5.

        System.out.println("Завдання 2:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double number = scanner.nextDouble();

        System.out.print("Введіть відсоток: ");
        double percentage = scanner.nextDouble();

        double result2 = (percentage / 100) * number;

        System.out.println("Результат: " + percentage + "% від " + number + " = " + result2);

        scanner.close();
        }

        public static void task3(){
//      Завдання 3:
//      Користувач вводить з клавіатури 3 числа. Необхідно створити число, що містить ці числа.
//      Наприклад, якщо з клавіатури введено 7, 3, 8, тоді потрібно сформувати число 738.

        System.out.println("Завдання 3:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        int result3 = Integer.parseInt(String.valueOf(num1) + String.valueOf(num2) + String.valueOf(num3));


        System.out.println("Результат: " + result3);

        scanner.close();

        }

        public static void task4(){
//      Завдання 4:
//      Користувач вводить шестизначне число. Необхідно змінити в цьому числі перше і шосте число, а
//      також друге і п’яте число. Наприклад, 723895 повинно перетворитися на 593827
//      Якщо користувач ввів не шестизначне число потрібно вивести повідомлення про помилку.

        System.out.println("Завдання 4:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шестизначне число: ");
        int num = scanner.nextInt();

        if (String.valueOf(num).length() != 6) {
            System.out.println("Помилка: Введіть шестизначне число!");
            return;
        }

        int digit1 = num / 100000;
        int digit2 = (num / 10000) % 10;
        int digit3 = (num / 1000) % 10;
        int digit4 = (num / 100) % 10;
        int digit5 = (num / 10) % 10;
        int digit6 = num % 10;

        int newNum = digit6 * 100000 + digit5 * 10000 + digit3 * 1000 + digit4 * 100 + digit2 * 10 + digit1;


        System.out.println("Результат: " + newNum);

        scanner.close();
        }

        public static void task5(){
//            Завдання 5:
//    Користувач вводить з клавіатури номер місяця(1-12). В залежності від отриманого номера програма
//    виводить на екран надпис : Winter (якщо введене значення 1,2 або 12), Spring (якщо введене значення від
//    3 до 5), Summer (якщо введене значення від 6 до 8), Autumn (якщо введене значення від 9 до 11).
//    Якщо користувач ввів значення не в діапазоні від 1 до 12 потрібно вивести повідомлення про помилку.


            System.out.println("Завдання 5:");

                Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть номер місяця (1-12): ");
            int month = scanner.nextInt();

            String season = switch (month) {
                case 1, 2, 12 -> "Зима";
                case 3, 4, 5 -> "Весна";
                case 6, 7, 8 -> "Літо";
                case 9, 10, 11 -> "Осінь";
                default -> "Помилка: Невірно введений номер місяця!";
            };

            System.out.println("Пора року: " + season);

            scanner.close();
        }

        public static void task6(){
//        Завдання 6:
//        Користувач вводить з клавіатури кількість метрів. В залежності від вибору користувача програма
//        переводить метри в милі, дюйми чи ярди

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість метрів: ");
            double meters = scanner.nextDouble();


            System.out.println("Оберіть одиниці вимірювання:\n милі  - 1\n дюйми - 2\n ярди  - 3\n Введіть ваш вибір: ");
            int choice = scanner.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = meters * 0.000621371;
                    System.out.println("Результат: " + result + " миль");
                    break;
                case 2:
                    result = meters * 39.3701;
                    System.out.println("Результат: " + result + " дюймів");
                    break;
                case 3:
                    result = meters * 1.09361;
                    System.out.println("Результат: " + result + " ярдів");
                    break;
                default:
                    System.out.println("Помилка: Неправильний вибір одиниць вимірювання!");
            }

            scanner.close();
        }

        public static void task7(){
//        Завдання 7:
//        Користувач вводить з клавіатури два числа. Потрібно вивести всі непарні числа в вказаному
//        діапазоні. Якщо границі вказані не вірно потрібно провести нормалізацію границь. Наприклад,
//        якщо ввели 20 і 11, потрібна нормалізація, після якої початок стане рівним 11, а кінець 20.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть перше число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введіть друге число: ");
            int num2 = scanner.nextInt();

            int start = Math.min(num1, num2);
            int end = Math.max(num1, num2);

            System.out.println("Непарні числа у діапазоні від " + start + " до " + end + ":");
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0)
                    System.out.print(i + "\t");
            }

            System.out.println();
            scanner.close();
        }

        public static void task8(){
//        Завдання 8:
//        Показати на екрані таблицю множення в діапазоні, вказаному користувачем. Наприклад, якщо
//        користувач вказав 3 і 5, таблиця може виглядати так
//        3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
//        ……………………………………………………
//        5*1 = 5 5 *2 = 10 5 *3 = 15 ………….

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть перше число: ");
            int start2 = scanner.nextInt();

            System.out.print("Введіть друге число: ");
            int end2 = scanner.nextInt();

            System.out.println("Таблиця множення для діапазону від " + start2+ " до " + end2 + ":");

            for (int i = start2; i <= end2; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i + " * " + j + " = " + (i * j) + "\t");
                }
                System.out.println();
            }

            scanner.close();
        }

        public static void task9(){
//        Завдання 9:
//        В одномірному масиві, заповненому випадковими числами, визначаємо мінімальне і
//        максимальне значення, підраховуємо кількість від’ємних значень, підраховуємо кількість
//        додатних значень, підраховуємо кількість нулів. Результат виводимо на екран.


            System.out.println("Cтворюємо масив і заповнюємо випадковими числами.");
            // рандом
            Random random = new Random();

            int size = 50;
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(101) - 50; // генеруємо випадкове число в діапазоні [-50, 50]
            }


            int min = 0;
            int max =0;
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            // кількість від'ємних, додатних та нульових значень
            int negativeCount = 0;
            int positiveCount = 0;
            int zeroCount = 0;

            for (int num : array) {
                    if (num < 0) {
                        negativeCount++;
                    } else if (num > 0) {
                        positiveCount++;
                    } else {
                        zeroCount++;
                    }
            }

            System.out.println("Мінімальне значення: " + min);
            System.out.println("Максимальне значення: " + max);
            System.out.println("Кількість від'ємних значень: " + negativeCount);
            System.out.println("Кількість додатних значень: " + positiveCount);
            System.out.println("Кількість нульових значень: " + zeroCount);
        }

        public static void task10(){
//        Завдання 10:
//        Маємо одновимірний масив, заповнений випадковими числами. На основі даних масиву
//        потрібно:
//        Створити одновимірний масив, що містить лише парні числа з першого масиву
//        Створити одновимірний масив, що містить лише непарні числа з першого масиву
//        Створити одновимірний масив, що містить лише від’ємні числа з першого масиву
//        Створити одновимірний масив, що містить лише додатні числа з першого масиву


        Random random2 = new Random();

        int size = 50;
        int[] array0 = new int[size];
        for (int i = 0; i < array0.length; i++) {
            array0[i] = random2.nextInt(101) - 50; // генеруємо випадкове число в діапазоні [-50, 50]
        }

        // створення масивів для парних, непарних, від'ємних та додатних чисел
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int[] negativeArray = new int[size];
        int[] positiveArray = new int[size];

        // створення змінних для count масивів
        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        for (int num : array0) {
            //перевірка на парність
            if (num % 2 == 0) {
                evenArray[evenCount++] = num;
            } else {
                oddArray[oddCount++] = num;
            }

            //перевірка на негатив
            if (num < 0) {
                negativeArray[negativeCount++] = num;
            } else if (num > 0) {
                positiveArray[positiveCount++] = num;
            }
        }

        // вивід результатів
        System.out.println("Парні числа:");
        printArray(evenArray, evenCount);

        System.out.println("Непарні числа:");
        printArray(oddArray, oddCount);

        System.out.println("Від'ємні числа:");
        printArray(negativeArray, negativeCount);

        System.out.println("Додатні числа:");
        printArray(positiveArray, positiveCount);
    }
            // метод виведення масиву
            public static void printArray(int[] array, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


        public static void task11(){
//        Завдання 11:
//        Написати метод, що відображає вертикальну або горизонтальну лінію із деяких символів. Метод приймає
//        в якості параметрів: довжину лінії, напрям, символ.

        // Виводимо вертикальну лінію з 5 символів '|'
        drawLine(5, "vertical", '|');

        // Виводимо горизонтальну лінію з 7 символів '-'
        drawLine(7, "horizontal", '-');

        }
            // Метод відображення лінії
            public static void drawLine ( int length, String direction,char symbol){
                if (direction.equals("vertical")) {
                    // вертикальна лінія
                    for (int i = 0; i < length; i++) {
                        System.out.println(symbol);
                    }
                } else if (direction.equals("horizontal")) {
                    // горизонтальна лінія
                    for (int i = 0; i < length; i++) {
                        System.out.print(symbol);
                    }
                    System.out.println(); // перехід на новий рядок після завершення лінії
                } else {
                    System.out.println("Невірний напрям лінії!");
                }
            }


        public static void task12(){
    //        Завдання 12:
    //        Написати метод, що сортує масив по спаданню або зростанню в залежності від вибору
    //        користувача

            Random random3 = new Random();
            Scanner scanner = new Scanner(System.in);

            int size = 50;
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = random3.nextInt(101) - 50; // генеруємо випадкове число в діапазоні [-50, 50]
            }

            System.out.println("Створено масив, який був заповнений випадковими числами.");

            // Сортування масиву
            boolean flag;
            do{
                flag = false;
                // Вибір напрямку сортування
                System.out.println("Оберіть напрямок сортування масива:\nза зростанням - 1\nза спаданням  - 2\nВаш вибір:");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    Arrays.sort(array);
                } else if (choice == 2) {
                    Arrays.sort(array);
                    reverse(array);
                } else {
                    System.out.println("Не визначено напрямок сортування!");
                    flag = true;
                }
            }while (flag);

            // Виведення результату
            System.out.println("Відсортований масив: " + Arrays.toString(array));

            scanner.close();
        }
            // Метод реверсу масиву
            public static void reverse(int[] array) {
                int start = 0;
                int end = array.length - 1;

                while (start < end) {

                    // обмін значень
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;

                    // перехід до наступної пари елементів
                    start++;
                    end--;
                }
            }
}