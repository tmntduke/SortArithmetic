import java.util.Arrays;

/**
 * Created by tmnt on 2017/11/20.
 */
public class SelectSort {
    public static void selectSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
