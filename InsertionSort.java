
public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int target = a[i];
            int position = i;
            while (position > 0 && target < a[position-1]) //  Shift larger values to the right
            {
                a[position] = a[position - 1];
                position--;
            }
            a[position] = target;
        }
    }

}
