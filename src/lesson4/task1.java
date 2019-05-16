package lesson4;

public class task1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        try {
            System.out.println(div(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(multipl(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int num, int denum) throws ArithmeticException {
        if (denum == 0) {
            throw new ArithmeticException("Делить на ноль нельзя.");
//            System.out.println("Делить на ноль нельзя.");
//            return -1;
        }
        return num / denum;
    }

    public static int multipl(int a, int b) {
        return a * b;
    }

}
