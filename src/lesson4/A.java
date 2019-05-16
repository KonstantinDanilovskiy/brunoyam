package lesson4;

public class A {
    private int a = 10;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int sum() {
        return ++a;
    }

    public int calc() {
        return sum();
    }

    public static int show100() {
        return 100;
    }


}
