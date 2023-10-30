package Bai1_OOP;

import java.util.ArrayList;
import java.util.List;

public class Order<T extends AbstractItem> implements IOrder<T> {
    private List<T> items;
    public Order(){
        items = new ArrayList<>();
    }

    @Override
    public void AddItem(T item) {
        items.add(item);
    }


    @Override
    public double GetTotal() {
        double total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }

}
