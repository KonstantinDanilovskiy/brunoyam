package lesson4;

public class task5 {
    public static void main(String[] args) {
        int[] array ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array1 ={1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(array1);
        for (int i : array1) {
            System.out.println(i);
        }
    }

    public static void reverseArray(int[] array) {
        int buff;
        for (int i = 0; i < array.length/2; i++) {
            buff = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buff;
        }
    }
}
