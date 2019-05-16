package lesson4;

public class B extends A {

//    public static int show100() {
//        return 200;
//    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.setA(15);
        System.out.println(a.getA());
        System.out.println(b.getA());

        System.out.println(a.calc());
        System.out.println(b.calc());

        System.out.println(A.show100());
        System.out.println(B.show100());
    }
}
