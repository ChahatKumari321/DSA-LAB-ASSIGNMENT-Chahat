public class doublylinklist {

    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    Node head, tail;

    // Insert at beginning — O(1)
    void insertAtBeginning(int data) {
        Node n = new Node(data);
        if(head == null) head = tail = n;
        else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    // Insert at end — O(1)
    void insertAtEnd(int data) {
        Node n = new Node(data);
        if(head == null) head = tail = n;
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    void displayForward() {
        System.out.print("Forward: ");
        Node t = head;
        while(t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    void displayBackward() {
        System.out.print("Backward: ");
        Node t = tail;
        while(t != null) {
            System.out.print(t.data + " ");
            t = t.prev;
        }
        System.out.println();
    }

    // Delete first — O(1)
    void deleteFirst() {
        if(head == null) return;
        if(head == tail) head = tail = null;
        else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete last — O(1)
    void deleteLast() {
        if(tail == null) return;
        if(head == tail) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete by value — O(n)
    void deleteByValue(int val) {
        Node t = head;
        while(t != null && t.data != val) t = t.next;
        if(t == null) return;

        if(t == head) deleteFirst();
        else if(t == tail) deleteLast();
        else {
            t.prev.next = t.next;
            t.next.prev = t.prev;
        }
    }

    // Delete before value — O(n)
    void deleteBeforeValue(int val) {
        Node t = head;
        while(t != null && t.data != val) t = t.next;
        if(t == null || t.prev == null) return;

        Node del = t.prev;
        if(del == head) deleteFirst();
        else {
            del.prev.next = t;
            t.prev = del.prev;
        }
    }

    // Delete after value — O(n)
    void deleteAfterValue(int val) {
        Node t = head;
        while(t != null && t.data != val) t = t.next;
        if(t == null || t.next == null) return;

        Node del = t.next;
        if(del == tail) deleteLast();
        else {
            t.next = del.next;
            del.next.prev = t;
        }
    }

    // Find Min & Max — O(n)
    void findMinMax() {
        int min = head.data, max = head.data;
        Node t = head;
        while(t != null) {
            if(t.data < min) min = t.data;
            if(t.data > max) max = t.data;
            t = t.next;
        }
        System.out.println("DLL Min = " + min + " Max = " + max);
    }
}
