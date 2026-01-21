class recursionproblem {
    int factorial(int n) {
        if (n == 1) return 1;          // base case
        return n * factorial(n - 1);  // recursive case
    }

    int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    int sumArray(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sumArray(arr, i + 1);
    }

    boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        return arr[i] <= arr[i + 1] && isSorted(arr, i + 1);
    }

    void findMinMax(int[] arr, int i, int min, int max) {
        if (i == arr.length) {
            System.out.println("Recursion Min: " + min + " Max: " + max);
            return;
        }
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
        findMinMax(arr, i + 1, min, max);
    }
}
