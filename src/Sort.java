/**
 * Created by tmnt on 2017/11/20.
 */
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {

        int[] array = {5, 2, 0, 1, 3, 1, 4};

        int[]a ={49,38,65,97,76,13,27,49};

        // InsertSort.insertSort(a);
        // System.out.println("\n");

        // ShellSort.shellsort(array);
        // System.out.println("\n");

        // SelectSort.selectSort(array);
        // System.out.println("\n");

        // BubbleSort.bubbleSort(a);
        // System.out.println("\n");

        // QuickSort.quickSort(a,0,a.length-1);
        // System.out.println(Arrays.toString(a));

        HeapSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
