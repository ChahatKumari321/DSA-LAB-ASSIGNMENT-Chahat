class serachingalgo {
    // O(log n)
    int binarySearchIterative(int[] arr, int key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == key) return m;
            else if (arr[m] < key) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
    // O(log n)
    int binarySearchRecursive(int[] arr, int l, int r, int key) {
        if (l > r) return -1;
        int m = (l + r) / 2;
        if (arr[m] == key) return m;
        if (arr[m] > key) return binarySearchRecursive(arr, l, m - 1, key);
        return binarySearchRecursive(arr, m + 1, r, key);
    }

    // O(n)
    int linearSearchRecursive(int[] arr, int i, int key) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return linearSearchRecursive(arr, i + 1, key);
    }

    // O(n)
    void findMinMaxRecursive(int[] arr, int i, int min, int max) {
        if (i == arr.length) {
            System.out.println("Recursive Min: " + min + " Max: " + max);
            return;
        }
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
        findMinMaxRecursive(arr, i + 1, min, max);
    }
}
