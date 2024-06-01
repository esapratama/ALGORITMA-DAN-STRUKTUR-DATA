public class BinaryTree10 {

    Node10 root;

    public BinaryTree10() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        root = addRecursive(root, data);
    }

    // menambahkan method recursive
    private Node10 addRecursive(Node10 current, int data) {
        if (current == null) {
            return new Node10(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    Node10 find(int data) {
        return findRecursive(root, data);
    }

    private Node10 findRecursive(Node10 current, int data) {
        if (current == null || current.data == data) {
            return current;
        }

        if (data < current.data) {
            return findRecursive(current.left, data);
        } else {
            return findRecursive(current.right, data);
        }
    }

    void traversePreOrder(Node10 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node10 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void traverseInOrder(Node10 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    Node10 getSuccessor(Node10 del) {
        Node10 successor = del.right;
        Node10 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private Node10 deleteRecursive(Node10 current, int data) {
        if (current == null) {
            return null;
        }

        if (data == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.left == null) {
                return current.right;
            }
            if (current.right == null) {
                return current.left;
            }
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (data < current.data) {
            current.left = deleteRecursive(current.left, data);
        } else {
            current.right = deleteRecursive(current.right, data);
        }

        return current;
    }

    private int findSmallestValue(Node10 root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    // menambahkan method nilai yang paling kecil
    public int findMinValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return Integer.MIN_VALUE;
        }
        Node10 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // menambahkan method nilai yang paling besar
    public int findMaxValue() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return Integer.MAX_VALUE;
        }
        Node10 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // menambahkan method untuk menampilkan data di leaf nodes
    public void displayLeafNodes() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return;
        }
        System.out.print("Leaf nodes: ");
        displayLeafNodesRecursive(root);
        System.out.println();
    }

    // menambahkan method rekursif untuk menampilkan data di leaf nodes
    private void displayLeafNodesRecursive(Node10 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            displayLeafNodesRecursive(node.left);
            displayLeafNodesRecursive(node.right);
        }
    }

    // menambahkan method untuk menghitung jumlah leaf nodes dalam pohon
    public int countLeaves() {
        return countLeavesRecursive(root);
    }

    // menambahkan method rekursif untuk menghitung jumlah leaf nodes
    private int countLeavesRecursive(Node10 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
    }
}
