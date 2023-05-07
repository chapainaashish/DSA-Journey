package Stack;

import java.util.Stack;

public class ReverseStringStack {

    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();

        String name = "aashish";
        String reversename = "";

        char[] namearray = name.toCharArray();

        for (char i: namearray){
            stack1.push(i);
        }

        // Other Part of Story: Use StringBuffer for effectively handling String Concatenation
        for (char i: namearray){
            reversename +=  stack1.pop();
        }
        System.out.println(reversename);


    }
}
