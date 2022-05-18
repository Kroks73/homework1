package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        System.out.println("Orange/Banana/Apple");
    }

    private static void checkSumSign() {
        int a = 13;
        if (a >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 13;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100 && value > 0){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 10;
        int b = 23;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
