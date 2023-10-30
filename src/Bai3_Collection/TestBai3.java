package Bai3_Collection;

public class TestBai3 {
    public static void main(String[] args) {
        Queue<Customer> q = new Queue<>();
        q.offer(new Customer("Nguyen Van A", 19));
        q.offer(new Customer("Tran Minh Thang", 20));
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }

        Stack<Customer> st = new Stack<>();
        st.push(new Customer("Le Minh Duc", 25));
        st.push(new Customer("Nguyen Thi B", 26));
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

        System.out.println("Ket thuc chuong trinh !");
    }
}
