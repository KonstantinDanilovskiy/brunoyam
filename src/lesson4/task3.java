package lesson4;

public class task3 {
    public static void main(String[] args) {
        System.out.println(sumOfArrayElements(new int[]{1, 2, 3, 4, 5, 10}));
    }

    public static int sumOfArrayElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
             sum+= array[i];
        }
        return sum;
    }
}
