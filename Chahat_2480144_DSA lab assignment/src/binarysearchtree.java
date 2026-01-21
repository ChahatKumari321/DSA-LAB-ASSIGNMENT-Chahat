
class binarysearchtree {
    class Node { int data; Node left, right; Node(int d){data=d;} }
    Node root;
    // O(h)
    void insert(int val) {
        root = insertRec(root, val);
    }
    Node insertRec(Node r, int val) {
        if (r == null) return new Node(val);
        if (val < r.data) r.left = insertRec(r.left, val);
        else r.right = insertRec(r.right, val);
        return r;
    }
    void inorder() { System.out.print("Inorder: "); inorderRec(root); System.out.println(); }
    void preorder() { System.out.print("Preorder: "); preorderRec(root); System.out.println(); }
    void postorder() { System.out.print("Postorder: "); postorderRec(root); System.out.println(); }
    void inorderRec(Node r) {
        if (r != null) { inorderRec(r.left); System.out.print(r.data + " "); inorderRec(r.right); }
    }

    void preorderRec(Node r) {
        if (r != null) { System.out.print(r.data + " "); preorderRec(r.left); preorderRec(r.right); }
    }

    void postorderRec(Node r) {
        if (r != null) { postorderRec(r.left); postorderRec(r.right); System.out.print(r.data + " "); }
    }
    // O(h)
    boolean search(int val) {
        Node t = root;
        while (t != null) {
            if (t.data == val) return true;
            else if (val < t.data) t = t.left;
            else t = t.right;
        }
        return false;
    }
    // O(h)
    void delete(int val) { root = deleteRec(root, val); }

    Node deleteRec(Node r, int val) {
        if (r == null) return null;
        if (val < r.data) r.left = deleteRec(r.left, val);
        else if (val > r.data) r.right = deleteRec(r.right, val);
        else {
            if (r.left == null) return r.right;
            if (r.right == null) return r.left;
            r.data = minValue(r.right);
            r.right = deleteRec(r.right, r.data);
        }
        return r;
    }

    int minValue(Node r) {
        while (r.left != null) r = r.left;
        return r.data;
    }
    // O(n)
    void findMinMax() {
        Node t = root;
        while (t.left != null) t = t.left;
        int min = t.data;
        t = root;
        while (t.right != null) t = t.right;
        int max = t.data;
        System.out.println("BST Min: " + min + " Max: " + max);
    }
    int countNodes() { return countRec(root); }
    int countRec(Node r) { return (r == null) ? 0 : 1 + countRec(r.left) + countRec(r.right); }
    int countLeafNodes() { return leafRec(root); }
    int leafRec(Node r) {
        if (r == null) return 0;
        if (r.left == null && r.right == null) return 1;
        return leafRec(r.left) + leafRec(r.right);
    }

    int height() { return heightRec(root); }
    int heightRec(Node r) {
        if (r == null) return -1;
        return 1 + Math.max(heightRec(r.left), heightRec(r.right));
    }
}
