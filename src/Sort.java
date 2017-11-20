/**
 * Created by tmnt on 2017/11/20.
 */
public class Sort {
    public static void main(String[] args) {

        int[] array = {5, 2, 0, 1, 3, 1, 4};

        InsertSort.insertSort(array);
        System.out.println("\n");

        ShellSort.shellsort(array);
        System.out.println("\n");

        SelectSort.selectSort(array);
        System.out.println("\n");

        BubbleSort.bubbleSort(array);
        System.out.println("\n");
    }
}
