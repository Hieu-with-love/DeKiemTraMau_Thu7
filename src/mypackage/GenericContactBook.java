package mypackage;

import java.util.HashMap;
import java.util.Map;

public class GenericContactBook <K, V> implements ContactBook<K, V>{
    private Map<K, V> contacts = new HashMap<>();
    @Override
    public void addContact(K key, V value) {
        if (contacts.containsValue(value)){
            System.out.println("Lien he da co trong danh ba");
        }
        else{
            contacts.put(key, value);
        }
    }

    @Override
    public V getContact(K key) {
        try {
            if (contacts.containsKey(key)){
                return contacts.get(key);
            }
            else{
                throw new Exception("Khong co lien he trong danh ba de lay.");
            }
        }
        catch(Exception ex){
            System.out.println("Ngoai le dang gap phai: " + ex.getMessage());
            return null;
        }
    }

    @Override
    public void displayAllContact() {
        for (Map.Entry<K, V> entry : contacts.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

}
