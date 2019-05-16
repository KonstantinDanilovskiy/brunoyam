package lesson4;

public class task4 {
    public static void main(String[] args) {
        int[] array ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] res = reverseArray(array);
        for (int i : res) {
            System.out.println(i);
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[i] = array[j];
            j++;
        }
        return result;
    }
}
