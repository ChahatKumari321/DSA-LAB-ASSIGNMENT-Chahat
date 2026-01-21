public class queueusingarray {
    int[] arr;
    int front = 0, rear = -1, size = 0;
    public queueusingarray(int cap) {
        arr = new int[cap];
    }
    // Enqueue — O(1) amortized
    void enqueue(int val) {
        if(size == arr.length) resize();
        rear++;
        arr[rear] = val;
        size++;
    }

    void resize() {
        int[] newArr = new int[arr.length * 2];
        for(int i=0;i<arr.length;i++)
            newArr[i] = arr[i];
        arr = newArr;
        System.out.println("Array Resized");
    }
    // Dequeue — O(1)
    void dequeue() {
        if(size == 0) return;
        front++;
        size--;
    }
    void peek() {
        if(size > 0)
            System.out.println("Peek = " + arr[front]);
    }

    void display() {
        System.out.print("Queue: ");
        for(int i=front;i<=rear;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Min & Max — O(n)
    void findMinMax() {
        int min = arr[front], max = arr[front];
        for(int i=front;i<=rear;i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Queue Min = " + min + " Max = " + max);
    }
}
