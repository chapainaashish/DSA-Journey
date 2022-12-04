package JavaLinkedlist.DLL;


public class SearchDLL {
    class  Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public Node head = null;


    public void insertatEnd(int x){
        Node newnode = new Node(x);

        if (head == null){
            head = newnode;
        }

        else {
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }

            temp.next = newnode;
            newnode.prev = temp;
        }

    }

    public boolean search(int key){
        Node temp = head;

        while(temp!=null){
            if (temp.data==key)
                return true;
            temp = temp.next;
        }
        return  false;

    }

    public static void main(String[] args){
        SearchDLL list = new SearchDLL();
        list.insertatEnd(1);
        list.insertatEnd(2);
        list.insertatEnd(3);
        System.out.println(list.search(2));
    }
}
