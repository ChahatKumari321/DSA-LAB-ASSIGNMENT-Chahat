public class queueusinglinkedlist {
    class Node {
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    Node front, rear;
    // Enqueue — O(1)
    void enqueue(int val) {
        Node n = new Node(val);
        if(front == null) front = rear = n;
        else {
            rear.next = n;
            rear = n;
        }
    }

    // Dequeue — O(1)
    void dequeue() {
        if(front == null) return;
        front = front.next;
        if(front == null) rear = null;
    }
    void peek() {
        if(front != null)
            System.out.println("Peek = " + front.data);
    }
    // Min & Max — O(n)
    void findMinMax() {
        int min = front.data, max = front.data;
        Node t = front;
        while(t != null) {
            if(t.data < min) min = t.data;
            if(t.data > max) max = t.data;
            t = t.next;
        }
        System.out.println("LL Queue Min = " + min + " Max = " + max);
    }
}
