package JavaLinkedlist.BuiltinLL;

import java.util.Arrays;
import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        // can only save int type
        // LinkedList<Integer> intlist = new LinkedList<>();

        // each node can have different data type; no restriction;
        LinkedList list = new LinkedList();

        // adding element
        list.add(1);
        list.addFirst(0);
        list.add(0, -1);
        list.addLast(2);

        System.out.println(list);

        // checking the member
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(1));

        // removing element
        list.remove(0);
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());

        // converting list to array
        var arraylist = list.toArray();

        System.out.println(Arrays.toString(arraylist));
    }

}
