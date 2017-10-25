package es.esy.kapcapx;

public class Main {

    public static void main(String[] args) {
        comparison(-10, -11);
        int x = 2;
        int y = 30;
        System.out.println(attemptFor(x, y));
        System.out.println(attemptWhile(x, y));
        System.out.println(attemptDoWhile(x, y));
        x = 19;
        y = 20;
        System.out.println(attemptFor(x, y));
        System.out.println(attemptWhile(x, y));
        System.out.println(attemptDoWhile(x, y));

        // Оператор switch
        String string = attemptFor(13, 10);
        displaySwith(string);
        string = attemptWhile(20, 20);
        displaySwith(string);
        string = attemptDoWhile(18, 15);
        displaySwith(string);

        // 4 Sub-task
        displayNumber(20);
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
    public static String attemptFor (int a, int b) {
        int maxTry = 10;
        int addition = a + b;
        int tmp = addition;
        int composition;
        composition = a * b;
        String result = "";
        for (int i = 0; i < maxTry; i++) {
            if (composition < tmp) {
                result = "Цель достигнута: " + "количество попыток " + "[" + (i + 1) + "]";
                break;
            } else {
                tmp += addition;
                if (i == (maxTry - 1))
                    result = "Цель не достигнута, попытки исчерпаны";
            }
        }
        return result;
    }
    // Метод решающий задачу с помощью цикла while
    public static String attemptWhile (int a, int b) {
        int maxTry = 10;
        int addition = a + b;
        int tmp = addition;
        int composition;
        composition = a * b;
        String result = "";
        int i = 0;
        while (i < maxTry) {
            if (composition < tmp) {
                result = "Цель достигнута: " + "количество попыток " + "[" + (i + 1) + "]";
                break;
            } else {
                tmp += addition;
                if (i == (maxTry - 1))
                    result = "Цель не достигнута, попытки исчерпаны";
            }
            i++;
        }
        return result;
    }
    // Метод решающий задачу с помощью цикла do while
    public static String attemptDoWhile (int a, int b) {
        int maxTry = 10;
        int addition = a + b;
        int tmp = addition;
        int composition;
        composition = a * b;
        String result = "";
        int i = 0;
        do {
            if (composition < tmp) {
                result = "Цель достигнута: " + "количество попыток " + "[" + (i + 1) + "]";
                break;
            } else {
                tmp += addition;
                if (i == (maxTry - 1)){
                    result = "Цель не достигнута, попытки исчерпаны";
                    break;
                }
            }
            i++;
        } while (i < maxTry);
        return result;
    }
    // Метод с оператором switch
    public static void displaySwith (String string) {
        int numberTry;
        if (string.equals("Цель не достигнута, попытки исчерпаны")) {
            numberTry = 0;
        } else {
            numberTry = Integer.parseInt(string.replaceAll("[\\D]", ""));
        }
        System.out.println("");
        switch (numberTry) {
            case 1 :
                System.out.println("Количество попыток одна шт.");
                break;
            case 2 :
                System.out.println("Количество попыток две шт.");
                break;
            case 3 :
                System.out.println("Количество попыток три шт.");
                break;
            case 4 :
                System.out.println("Количество попыток четыри шт.");
                break;
            case 5 :
                System.out.println("Количество попыток пять шт.");
                break;
            case 6 :
                System.out.println("Количество попыток шесть шт.");
                break;
            case 7 :
                System.out.println("Количество попыток семь шт.");
                break;
            case 8 :
                System.out.println("Количество попыток восемь шт.");
                break;
            case 9 :
                System.out.println("Количество попыток девять шт.");
                break;
            case 10 :
                System.out.println("Количество попыток десять шт.");
                break;
            default:
                System.out.println("Цель не достигнута, попытки исчерпаны");
        };
    }
    // 4 Sub-task
    public static void displayNumber (int number) {
        System.out.println("");
        System.out.println("*******"+ "4 Sub-task" + "*******");
        int tmp = 0;
        for (int i = number; i < (Math.pow(number, 2)); i++) {
            if ((i % 3) == 2) {
                System.out.println("[" + i + "]");
                tmp++;
                if (tmp == 4) {
                    break;
                }
                continue;
            }
        }
    }
}
