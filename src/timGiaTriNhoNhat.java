import java.util.Arrays;

public class timGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 0, 9, 2};
        int min = timMin(arr);
        System.out.println("Mảng: " + Arrays.toString(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }

    public static int timMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }
        return min;
    }
}
