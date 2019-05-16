package lesson4;

public class task2 {
    public static void main(String[] args) {
        System.out.println(countOfNegativeElementsInArray(new int[]{-1, 2, -3, 4, 5}));
    }

    public static int countOfNegativeElementsInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) count++;
        }
        return count;
    }
}
