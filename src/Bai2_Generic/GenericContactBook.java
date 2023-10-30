package Bai2_Generic;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.Map;

public class GenericContactBook<K, V> implements ContactBook<K, V> {
    private Map<K, V> contacts = new HashMap<>();
    @Override
    public void addContact(K key, V value) {
        if (contacts.containsKey(key)){
            System.out.println(key + " da ton tai trong danh ba");
        }
        else{
            contacts.put(key,value);
        }
    }

    @Override
    public V getContact(K key) {
        return contacts.get(key);
    }

    @Override
    public void displayAllContact() {
        for (Map.Entry<K, V> entry : contacts.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
