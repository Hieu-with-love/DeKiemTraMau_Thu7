package Bai3_Collection;

public class Customer {
    private String name;
    private double age;
    public Customer(String name, double age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "[" + name + ", " + age + "]";
    }
}
