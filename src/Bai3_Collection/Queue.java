package Bai3_Collection;

import java.util.LinkedList;

public class Queue<V> {
    private LinkedList<V> q;
    public Queue(){
        q = new LinkedList<>();
    }
    public void offer(V item){
        q.addLast(item);
    }
    public void poll(){
        if(q.isEmpty()){
            System.out.println("Queue is empty !");
            return;
        }
        else{
            q.removeFirst();
        }
    }
    public V peek(){
        if (q.isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        else{
            return q.getFirst();
        }
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }
}
