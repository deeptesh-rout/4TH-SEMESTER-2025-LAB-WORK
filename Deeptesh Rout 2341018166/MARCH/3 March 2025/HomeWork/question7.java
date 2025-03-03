class Pair<K, V> {
    private K key;
    private V value;

    // Parameterized constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter for key
    public K getKey() {
        return key;
    }

    // Setter for key
    public void setKey(K key) {
        this.key = key;
    }

    // Getter for value
    public V getValue() {
        return value;
    }

    // Setter for value
    public void setValue(V value) {
        this.value = value;
    }

    // Override toString() for displaying key-value pair
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class question7 {
    public static void main(String[] args) {
        // Creating Pair objects
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, Double> pair2 = new Pair<>("Pi", 3.14159);
        Pair<Character, Boolean> pair3 = new Pair<>('A', true);

        // Retrieving and printing key-value pairs
        System.out.println("Pair 1: " + pair1);
        System.out.println("Pair 2: " + pair2);
        System.out.println("Pair 3: " + pair3);
    }
}
