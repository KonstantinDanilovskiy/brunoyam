package lesson12;

public class Tree {

    public static void main(String[] args) {
        Node f = new Node("f", null, null);
        Node n = new Node("n", null, null);

        Node d = new Node("d", f, n);
        Node c = new Node("c", null, null);

        Node b = new Node("b", c, d);
        Node e = new Node("e", null, null);

        Node a = new Node("a", b, e);

        TreeImpl.walk(a);
    }

}
