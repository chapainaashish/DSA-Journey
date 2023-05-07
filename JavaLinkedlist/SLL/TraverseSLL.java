package JavaLinkedlist.SLL;

class TraverseSll {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
    }

    public void insertatEnd(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public static void main(String args[]) {
        TraverseSll s = new TraverseSll();
        s.insertatEnd(1);
        s.insertatEnd(2);
        s.insertatEnd(3);
        System.out.println("Traversing a  linked list:");
        s.traverse();
    }
}