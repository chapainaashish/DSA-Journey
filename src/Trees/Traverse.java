package  Trees;

class SearchBinaryTree {

class Node {
    int data;
    Node left, right;

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
            return new Node(data);
        }
        else if (data < root.data) {
            root.left = insertNode(root.left, data);

        } else if (data > root.data)
        {
            root.right = insertNode(root.right, data);
        }
        return root;
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

    public void preorder() {
        preorderTraverse(root);
    }

    private void preorderTraverse(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }

    public void postorder() {
        postorderTraverse(root);
    }

    private void postorderTraverse(Node root) {
        if (root != null) {
            postorderTraverse(root.left);
            postorderTraverse(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class Traverse {
    public static void main(String[] args) {
        SearchBinaryTree tree = new SearchBinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorder();

        System.out.println("\nPreorder traversal of the binary tree:");
        tree.preorder();

        System.out.println("\nPostorder traversal of the binary tree:");
        tree.postorder();
    }
}
