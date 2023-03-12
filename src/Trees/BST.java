package  Trees;

class BinaryTree {

    class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root = null;

    public void insert(int data) {
        root = insertNode(root, data);
    }


    private Node insertNode(Node root, int data) {
        if (root == null) {
            Node newnode = new Node(data);
            return newnode;
        }

        else if (data < root.data)
            root.left = insertNode(root.left, data);

        else if (data > root.data)
            root.right = insertNode(root.right, data);

        return root;
    }

    public void delete(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        }
        else if (data < root.data)
            root.left = deleteNode(root.left, data);

        else if (data > root.data)
            root.right = deleteNode(root.right, data);

        else {
            if (root.left == null)
                return root.right;

            else if (root.right == null)
                return root.left;

            Node temp = minNode(root);
            root.data = temp.data;
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    private Node minNode(Node root) {
        if (root.left!=null)
            return minNode(root.left);
        else
            return root;
    }

    public boolean search(int data) {
        return searchNode(root, data);
    }

    private boolean searchNode(Node root, int data) {
        if (root == null)
            return false;

        else if (root.data == data)
            return true;

        else if (data < root.data)
            return searchNode(root.left, data);

        else
            return searchNode(root.right, data);

    }

    public void inorder() {
        inorderTraverse(root);
    }

    private void inorderTraverse(Node root) {
        if (root != null) {
            inorderTraverse(root.left);
            System.out.print(root.data + " ");
            inorderTraverse(root.right);
        }
    }
}

public class BST {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();

        int searchValue = 60;
        boolean isFound = tree.search(searchValue);
        if (isFound) {
            System.out.println("\n" + searchValue + " is found in the binary tree.");
        } else {
            System.out.println("\n" + searchValue + " is not found in the binary tree.");
        }

        int deleteValue = 40;
        tree.delete(deleteValue);
        System.out.println("After deleting " + deleteValue + ", the inorder traversal of the binary tree:");
        tree.inorder();
    }
}
