package lesson13;

public class Main {
    public static void main(String[] args) {
        Const const1 = new Const(4);
        Const const2 = new Const(5);
        Const const3 = new Const(6);
        Const const4 = new Const(2);
        MultOperation multOperation = new MultOperation(const1, const2);
        DivOperation divOperation = new DivOperation(const3, const4);
        MinusOperation minusOperation = new MinusOperation(divOperation, const4);
        PlusOperation plus = new PlusOperation(multOperation, minusOperation);
        System.out.println(plus.calculate());
    }
}
