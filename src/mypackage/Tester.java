package mypackage;

public class Tester {
    public static void main(String[] args) {
        GenericContactBook<String, String> contactBook = new GenericContactBook<>();

        contactBook.addContact("Hieu", "0987332425");
        contactBook.addContact("Nhan", "0372849832");

        contactBook.addContact("Hieu", "hieu009bdvn@gmail.com");

        contactBook.displayAllContact();
    }
}
