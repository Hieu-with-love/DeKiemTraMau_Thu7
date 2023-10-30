package Bai3_Collection;

import java.util.LinkedList;

public class Stack<V> {
    private LinkedList<V> st;
    public Stack(){
        st = new LinkedList();
    }
    public void push(V item){
        st.addFirst(item);
    }
    public void pop(){
        if (st.isEmpty()){
            System.out.println("Stack is empty !");
            return ;
        }
        else{
            st.removeFirst();
        }
    }
    public V peek(){
        if (st.isEmpty()){
            System.out.println("Stack is empty !");
            return null;
        }
        else{
            return st.getFirst();
        }
    }
    public boolean isEmpty(){
        return st.isEmpty();
    }
}
