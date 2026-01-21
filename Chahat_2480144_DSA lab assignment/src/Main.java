public class Main {
    public static void main(String[] args) {

        // ************** Doubly Linked List ********************

        doublylinklist dll = new doublylinklist();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(5);
        dll.insertAtEnd(50);

        dll.displayForward();
        dll.displayBackward();

        dll.deleteFirst();
        dll.deleteLast();
        dll.deleteByValue(20);
        dll.deleteBeforeValue(30);
        dll.deleteAfterValue(20);

        dll.findMinMax();


        // ******************** Queue Using Array ****************

        queueusingarray qa = new queueusingarray(3);
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.enqueue(40); // resize number
        qa.display();
        qa.findMinMax();

        // **************** Queue Using Linked List ****************

        queueusinglinkedlist ql = new queueusinglinkedlist();
        ql.enqueue(10);
        ql.enqueue(20);
        ql.enqueue(30);
        ql.dequeue();
        ql.findMinMax();

        // ***************** Searching Algorithms *******************

        serachingalgo sa = new serachingalgo();
        int[] arr = {3, 8, 12, 20, 25, 30};
        System.out.println("Iterative Binary Search 20: " + sa.binarySearchIterative(arr, 20));
        System.out.println("Recursive Binary Search 25: " + sa.binarySearchRecursive(arr, 0, arr.length - 1, 25));
        System.out.println("Recursive Linear Search 12: " + sa.linearSearchRecursive(arr, 0, 12));
        sa.findMinMaxRecursive(arr, 0, arr[0], arr[0]);

        // ************************* Recursion Problems **********************

        recursionproblem rp = new recursionproblem();
        System.out.println("Factorial 5: " + rp.factorial(5));
        System.out.println("Fibonacci 6: " + rp.fibonacci(6));
        int[] a = {2, 4, 6, 8};
        System.out.println("Sum: " + rp.sumArray(a, 0));
        System.out.println("Is Sorted: " + rp.isSorted(new int[]{3, 5, 7, 9}, 0));
        rp.findMinMax(a, 0, a[0], a[0]);

        // *********************** Sorting Algorithms *********************

        sortingalgo so = new sortingalgo();
        int[] sarr = {5, 1, 4, 2, 8};
        so.mergeSort(sarr, 0, sarr.length - 1);
        so.quickSort(sarr, 0, sarr.length - 1);

        // ********************** Binary Search Tree ***********************

        binarysearchtree bst = new binarysearchtree();
        int[] bstVals = {50, 30, 70, 20, 40, 60, 80};
        for (int v : bstVals) bst.insert(v);

        bst.inorder();
        bst.preorder();
        bst.postorder();

        System.out.println("Search 60: " + bst.search(60));
        bst.delete(80);
        bst.findMinMax();
        System.out.println("Total Nodes: " + bst.countNodes());
        System.out.println("Leaf Nodes: " + bst.countLeafNodes());
        System.out.println("Height: " + bst.height());
    }
}
