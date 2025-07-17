package Stack;

import java.util.Stack;

public class BasiceStack {
    public static void main(String[] args) {
        //Create stack
        Stack<Integer> stk=new Stack<Integer>();

        //size of stack element
        System.out.println("Stack element size is:-"+stk.size());

        //stack elements
        System.out.println("Stack element is:-"+stk);
        //add element in stack
        stk.push(12);
        stk.push(43);
        stk.push(87);
        stk.push(90);
        stk.push(21);

        //after adding element
        System.out.println("=============Added Element=============");
        //stack size is
        System.out.println("after adding size is:-"+stk.size());

        //stack element is
        System.out.println("after adding element is:-"+stk);
    }
}
