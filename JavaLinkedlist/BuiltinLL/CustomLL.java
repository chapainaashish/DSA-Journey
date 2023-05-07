package JavaLinkedlist.BuiltinLL;


import java.util.Arrays;
import java.util.NoSuchElementException;

class UserLL {
    private class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node first=null;
    private Node last=null;
    private int size=0;

    private boolean isEmpty(){
        return first==null;
    }

    public void addFirst(int data)
    {
        Node newnode = new Node(data);

        if(isEmpty()) {
            first = last = newnode;
        }

        else
        {
            newnode.next =first;
            first=newnode;
        }
        size++;
    }
    public void addLast(int data)
    {
        Node newnode = new Node(data);
        if(isEmpty()){
            first=last=newnode;
        }
        else
        {
           last.next=newnode;
           last=newnode;
        }
        size++;
    }

    public void deleteFirst()
    {
        if (isEmpty())
            throw  new NoSuchElementException();

        else if(first==last){
            first=last=null;
            size--;
        }

        else {
            Node temp = first;
            // making a second node first
            first = first.next;
            // nulling first node reference to second node
            temp.next=null;
            size--;
        }
    }

    private Node getPrevious(Node node){
        Node temp = first;
        while(temp!=null){
            if(temp.next==node)
                return temp;
            temp = temp.next;
        }
        return  null;

    }
    public void deleteLast()
    {
        if(isEmpty())
            throw  new NoSuchElementException();

        else if (first==last){
            first=last=null;
            size--;
        }


        else{
            Node previous = getPrevious(last);
            last=previous;
            last.next=null;
            size--;
        }
    }

    public boolean contains (int key){
      return  indexof(key) != -1;
        //return 2  != -1 (true)
        //return -1 != -1 (false)
    }

    public int indexof (int key){
        Node temp = first;
        int index=0;
        while (temp!=null)
        {
            if(temp.data==key)
                return index;
            temp=temp.next;
            index++;
        }
        return -1;
    }
    public void display()
    {
        Node temp=first;
        while(temp!=null)
        {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int array[] = new int[size];
        Node temp = first;
        int index = 0;
        while(temp!=null){
            array[index] = temp.data;
            index++;
            temp = temp.next;
        }
        return array;


    }
}

public class CustomLL {
    public static void main(String[] args) {
        UserLL list = new UserLL();
        list.addLast(9);
        list.addLast(10);
        list.addLast(12);
        int array[] = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
