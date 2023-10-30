package mypackage;

public interface ContactBook <K, V>{
    void addContact(K key, V value);
    V getContact(K key);
    void displayAllContact();
}
