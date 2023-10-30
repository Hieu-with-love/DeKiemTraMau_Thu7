package Bai1_OOP;

public interface IOrder<T> {
    void AddItem(T item);
    double GetTotal();
}
