package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BasicStack01 {
    public static void main(String[] args) {
        //create a new java file for stack practice
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.print("Enter the Length of Stack:-");
        int n=sc.nextInt();

        for (int i = 0; i <n ; i++) {
            System.out.print("Enter Stack Element:-");
            int x= sc.nextInt();
            st.push(x);
        }

        System.out.println("Stack Element is:-"+st);

        //Create new stack for store data in reverse method
        Stack<Integer> Rst=new Stack<>();
        while (st.size()>0){
            int x=st.peek();
            Rst.push(x);
            st.pop();
        }

        System.out.println(Rst);
    }
}
