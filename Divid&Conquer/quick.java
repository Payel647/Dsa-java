import java.util.*;

public class Main {

  public static int partition(int arr[], int st, int end) {
    int pivot = arr[end];
    int i = st - 1;

    for (int j = st; j < end; j++) {
      if (arr[j] <= pivot) {
        i++;
        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // place pivot in the correct position
    int temp = arr[i + 1];
    arr[i + 1] = arr[end];
    arr[end] = temp;

    return i + 1; // return pivot index
  }

  public static void quickSort(int arr[], int st, int end) {
    if (st < end) {
      int pivotIndex = partition(arr, st, end);
      quickSort(arr, st, pivotIndex - 1);   // left of pivot
      quickSort(arr, pivotIndex + 1, end);  // right of pivot
    }
  }

  public static void main(String[] args) {
    int arr[] = {6, 2, 5, 3};
    quickSort(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
