package Bai1_OOP;

public class TestBai1 {
    public static void main(String[] args) {
        DrinkItem di1 = new DrinkItem("Tra sua", 25000);
        DrinkItem di2 = new DrinkItem("Tra dao", 15000);
        DrinkItem di3 = new DrinkItem("Ca phe", 15000);

        FoodItem fi1 = new FoodItem("Banh xu kem", 17000);
        FoodItem fi2 = new FoodItem("Ga ran", 55000);
        FoodItem fi3 = new FoodItem("Banh plan", 12000);
        FoodItem fi4 = new FoodItem("Pizza", 149000);

        OnlineOrder<DrinkItem> order1 = new OnlineOrder<>();
        order1.AddItem(di1);
        order1.AddItem(di2);
        System.out.println("Tri gia don hang thu 1 = " + order1.GetTotal());

        OnlineOrder<FoodItem> order2 = new OnlineOrder<>();
        order2.AddItem(fi3);
        order2.AddItem(fi1);
        System.out.println("Tri gia don hang thu 2 = " + order2.GetTotal());

        DinelnOrder<DrinkItem> order3 = new DinelnOrder<>();
        order3.AddItem(di3);
        order3.AddItem(di1);
        System.out.println("Tri gia don hang thu 3 = " + order3.GetTotal());

        DinelnOrder<FoodItem> order4 = new DinelnOrder<>();
        order4.AddItem(fi2);
        order4.AddItem(fi4);
        order4.AddItem(fi1);
        System.out.println("Tri gia don hang thu 4 = " + order4.GetTotal());
    }
}
