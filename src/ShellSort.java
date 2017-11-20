import java.util.Arrays;

/**
 * Created by tmnt on 2017/11/20.
 */
public class ShellSort {
    public static void shellsort(int[] array) {
        for (int n = array.length, d = n / 2; d > 0; d /= 2) {//设增量
            for (int i = 0; i < d; i++) {//分组
                for (int j = i + d; j < n; j += d) {//每组进行插入排序
                    int temp = array[j];
                    int k = j - d;
                    for (; j >= 0 && array[k] > temp; k-=d) {
                        array[k + d] = array[k];
                    }

                    array[k + d] = temp;

                }

            }
        }

        System.out.println(Arrays.toString(array));

    }
}
