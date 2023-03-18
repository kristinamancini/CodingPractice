// LINEAR TIME APPROACH
// Java code for
// O(n) solution for finding
// maximum sum of a subarray
// of size k

class Main2 { 

  static int maxSum(int arr[], int n, int k) {

    // n must be greater
    if (n < k) {
      System.out.println("Invalid!");
      return -1;
    }

    // Computes sum of first window of size k
    int max_sum = 0;
    for (int i = 0; i < k; i++)
      max_sum = max_sum + arr[i];

    // Compute sums of remaining windows by
    // removing first element of previous
    // window and adding last element of
    // current window.
    int window_sum = max_sum;
    for (int i = k; i < n; i++) {
      window_sum = window_sum + arr[i] - arr[i - k];
      max_sum = Math.max(max_sum, window_sum);
    }
    return max_sum;
  }

  // Driver code
  public static void main(String[] args) {
    int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 21 };
    int k = 4;
    int n = arr.length;
    System.out.println(maxSum(arr, n, k));
  }
}

// This code is contributed
// by  prerna saini at geeks for geeks website