package Bai2_Generic;

public class TestBai2 {
    public static void main(String[] args) {
        GenericContactBook<String, String> contactBook = new GenericContactBook<>();

        contactBook.addContact("Hieu", "hieu01bdvn@gmail.com");
        contactBook.addContact("Minh", "0867828341");

        contactBook.displayAllContact();
    }
}
