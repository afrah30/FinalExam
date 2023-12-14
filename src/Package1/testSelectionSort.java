package Package1;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class testSelectionSort {

    @Test
    public void testPositive() {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {5, 2, 8, 1, 3};
        sorter.selectionSort(arr);
        int[] sortedArr = {1, 2, 3, 5, 8};
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testNegatives() {
        SelectionSort sorter = new SelectionSort();
        // second comment
        int[] arr = {-5, -2, -8, -1, -3};
        sorter.selectionSort(arr);
        int[] sortedArr = {-8, -5, -3, -2, -1};
        assertArrayEquals(sortedArr, arr);
    }

    @Test
    public void testMixed() {
        SelectionSort sorter = new SelectionSort();
        int[] arr = {5, -2, 0, 1, -3};
        sorter.selectionSort(arr);
        int[] sortedArr = {-3, -2, 0, 1, 5};
        assertArrayEquals(sortedArr, arr);
    }
}




