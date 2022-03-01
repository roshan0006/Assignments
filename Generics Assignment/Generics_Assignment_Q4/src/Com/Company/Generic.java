package Com.Company;

public class Generic <K, V>{
    K Key;
    V value;
    public K getKey() {
        return Key;
    }
    public void setKey(K key) {
        this.Key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}
