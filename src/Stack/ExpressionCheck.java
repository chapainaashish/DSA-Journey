package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpressionCheck {

    public static void main(String[] args) {
        Stack <Character> stack =new Stack<>();
        String expression = "(1+2))";

        for(char i: expression.toCharArray()){
            if (i =='(' || i=='[' || i=='{' || i=='<')
                stack.push(i);

            else if (i ==')' || i=='}' || i==']' || i=='>')
            {
                try{
                Character c1 = stack.pop();
                if (c1 == '(')
                    continue;
                else if (c1 == '{')
                    continue;
                else if (c1 == '<')
                    continue;
                else if (c1 == '[')
                    continue;

                else{
                    System.out.println("Syntax error");
                    break;
                }
                }
                catch (EmptyStackException e) {
                    System.out.println("Syntax error");;
                }

            }


        }
    }
}
