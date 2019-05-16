package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Const const1 = new Const("x");
        Const const2 = new Const("y");
        Const const3 = new Const("z");
        Const const4 = new Const("k");
        MultOperation multOperation = new MultOperation(const1, const2);
        DivOperation divOperation = new DivOperation(const3, const4);
        MinusOperation minusOperation = new MinusOperation(divOperation, const4);
        PlusOperation plus = new PlusOperation(multOperation, minusOperation);
        Map<String, Integer> map = new HashMap<>();
        map.put("x", 5);
        map.put("y", 4);
        map.put("z", 6);
        map.put("k", 2);
        System.out.println(plus.calculate(map));
    }
}
