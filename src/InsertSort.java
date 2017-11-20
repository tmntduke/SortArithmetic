import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by tmnt on 2017/11/20.
 */
public class InsertSort {
    public static void insertSort(int[] array) {
        for (int i = 1, n = array.length; i < n; i++) {//从第二个元素取
            int temp = array[i];//保存第i个元素
            int j = i - 1;//取此之前一个元素
            for (; j >= 0 && array[j] > temp; j--) {//向前比较,当前数比temp大就往后移一位
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }

        System.out.print(Arrays.toString(array));

    }
}
