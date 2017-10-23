package es.esy.kapcapx;

public class Main {

    public static void main(String[] args) {
        comparison(-10, -11);
    }
    // Метод сравнения
    public static void comparison (int a, int b) {
        if ((a + b) > (a - b)) {
            System.out.println("true" + " (a + b) = " + "[" + (a + b) + "]");
        } else {
            System.out.println("false" + " (a - b) = " + "[" + (a - b) + "]");
        }
    }
}
