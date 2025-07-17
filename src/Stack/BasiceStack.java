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

        //Remove element to stack
        System.out.println(stk.pop()); //Remove 22
        System.out.println(stk.pop()); //Remove 90

        //stack Availble element is
        System.out.println("Element is:-"+stk); //

        //peek:- Array is select top element of stack
        System.out.println(stk.peek()); //87
        System.out.println(stk);

        //print first element using while loops
        while (stk.size()>1){
            stk.pop();
        }

        System.out.println("first element:-"+stk);

    }
}
