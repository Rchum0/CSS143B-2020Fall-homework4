package Problem1;

import java.util.Stack;
/*

https://algorithms.tutorialhorizon.com/reverse-a-stack-using-recursion-in-place-without-using-extra-memory/
http://liesbeek.com/2016/06/22/reverse-stack-using-recursion/
https://discuss.codechef.com/t/reverse-a-stack-using/13596/3
 */
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        // homework
        if (stack.isEmpty() == false) {
            int x = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack,x);
        }

    }

    public static void insertAtBottom(Stack<Integer> stack, int x) {

        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int y = stack.pop();
        insertAtBottom(stack, x);
        stack.push(y);
    }
}