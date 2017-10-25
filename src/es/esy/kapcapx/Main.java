package es.esy.kapcapx;

public class Main {

    public static void main(String[] args) {
        comparison(-10, -11);
        int x = 2;
        int y = 30;
        attemptFor(x, y);
        attemptWhile(x, y);
        attemptDoWhile(x, y);
        x = 20;
        y = 20;
        attemptFor(x, y);
        attemptWhile(x, y);
        attemptDoWhile(x, y);
    }
    // Метод сравнения
    public static void comparison (int a, int b) {
        if ((a + b) > (a - b)) {
            System.out.println("true" + " (a + b) = " + "[" + (a + b) + "]");
        } else {
            System.out.println("false" + " (a - b) = " + "[" + (a - b) + "]");
        }
    }
    // Метод решающий задачу с помощью цикла for
    public static void attemptFor (int a, int b) {
        int maxTry = 10;
        int addition = a + b;
        int tmp = addition;
        int composition;
        composition = a * b;
        for (int i = 0; i < maxTry; i++) {
            if (composition < tmp) {
                System.out.println("Цель достигнута: " + "количество попыток " + "[" + (i + 1) + "]");
                break;
            } else {
                tmp += addition;
                if (i == (maxTry - 1))
                    System.out.println("Цель не достигнута, попытки исчерпаны");
            }
        }
    }
    // Метод решающий задачу с помощью цикла while
    public static void attemptWhile (int a, int b) {
        int maxTry = 10;
        int addition = a + b;
        int tmp = addition;
        int composition;
        composition = a * b;
        int i = 0;
        while (i < maxTry) {
            if (composition < tmp) {
                System.out.println("Цель достигнута: " + "количество попыток " + "[" + (i + 1) + "]");
                break;
            } else {
                tmp += addition;
                if (i == (maxTry - 1))
                    System.out.println("Цель не достигнута, попытки исчерпаны");
            }
            i++;
        }
    }
    // Метод решающий задачу с помощью цикла do while
    public static void attemptDoWhile (int a, int b) {
        int maxTry = 10;
        int addition = a + b;
        int tmp = addition;
        int composition;
        composition = a * b;
        int i = 0;
        do {
            if (composition < tmp) {
                System.out.println("Цель достигнута: " + "количество попыток " + "[" + (i + 1) + "]");
                break;
            } else {
                tmp += addition;
                if (i == (maxTry - 1)){
                    System.out.println("Цель не достигнута, попытки исчерпаны");
                    break;
                }
            }
            i++;
        } while (i < maxTry);
    }
}
