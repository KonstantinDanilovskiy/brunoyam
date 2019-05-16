package lesson12;

public class TreeImpl {
    static StringBuilder sb = new StringBuilder();

    public static void walk(Node current) {
      //  System.out.println("Enter " + current.value);
      //  System.out.print(current.value);
        if (current.left != null) walk(current.left);
        sb.append(current.value);
     //   System.out.print(current.value);
        if (current.right != null) walk(current.right);
      //  System.out.print(current.value);
        return;
    }

    public static void main(String[] args) {
        Node five = new Node("5", null, null);
        Node three = new Node("3", null, null);
        Node four = new Node("4", null, null);
        Node two = new Node("2", null, null);

        Node mult = new Node("*", five, three);
        Node div = new Node("/", four, two);

        Node plus = new Node("+", mult, div);

        walk(plus);
        System.out.println(sb);
        int result = Integer.parseInt(sb.toString().substring(0,1)) * Integer.parseInt(sb.toString().substring(2,3));
        System.out.println(result);


    }

}
