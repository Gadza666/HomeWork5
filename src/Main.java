public class Main {
    public static void main(String[] args) {
        System.out.println("Halla Vandala World");

        System.out.println(" Task 1 ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" Task 2 ");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println(" Task 3 ");

        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println(" Task 4 ");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println(" Task 5 ");

        for (int i = 1904; i < 2096; i ++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным ");
            }
        }

        System.out.println(" Task 6 ");

        for (int i = 7; i < 98; i += 7) {
            System.out.println(i);
        }

        System.out.println(" Task 7 ");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println(" Task 8 ");

        int amountSaving = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + amountSaving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println(" Task 9 ");

        int amountSaving1 = 29000;
        float total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + amountSaving1;
            total1 = total1 + total1 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }

        System.out.println(" Task 10 ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}