import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {

    public void sort(int[] a)
    {
        if(a.length > 1)
        {
            int[] left = getLeft(a);
            int[] right = getRight(a);
            sort(left);
            sort(right);
            merge(a,left,right);
        }
    }

    private int[] getLeft(int[] a)
    {
        int[] left = Arrays.copyOfRange(a, 0, a.length/2);
        return left;
    }

    private int[] getRight(int[] a)
    {
        int[] right = Arrays.copyOfRange(a, a.length/2, a.length);
        return right;
    }

    private void merge(int[] a, int[] left, int[] right)
    {
        int ai = 0;
        int lefti = 0;
        int righti = 0;


        while (lefti < left.length && righti < right.length) {
            if (left[lefti] <= right[righti]) { // stability == if two arrays have the same value, choose the left first
                a[ai++] = left[lefti++];
            }
            else {
                a[ai++] = right[righti++];
            }
        }
        while (lefti < left.length) {
            a[ai++] = left[lefti++];
        }
        while (righti < right.length) {
            a[ai++] = right[righti++];
        }
    }

}
