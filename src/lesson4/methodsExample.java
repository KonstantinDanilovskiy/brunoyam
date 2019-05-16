package lesson4;

public class methodsExample {
    public static void main(String[] args) {
        int a = 50;
        int b = 6;
        int c = sum(a, b);
        System.out.println("Result: " + c);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
