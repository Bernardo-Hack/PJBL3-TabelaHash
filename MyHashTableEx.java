public class MyHashTableEx <T> extends MyHashTable <T> {
    protected T[] values;
    protected MyLinkedList<String>[] keys;
    public MyHashTableEx(int size) {
        super(size);
    }

    @SuppressWarnings("unchecked")
    @Override
    void insert(Object key, T value) {
        if (this.isAlmostFull()) {
            this.doubleSize();
        }
        
        int keyPos = getKeyPos(key);

        if (this.keys[keyPos] == null) {
            this.keys[keyPos] = new MyLinkedList<String>(key.toString());
            this.values[keyPos] = (T) new MyLinkedList<T>(value);

        } else if (this.keys[keyPos] != null) {
            this.keys[keyPos].addValue(key.toString());
            ((MyLinkedList<T>) this.values[keyPos]).addValue(value);
        }

        this.quantItems++;
    }

    @Override
    T delete(Object key) {
        // TODO Auto-generated method stub
        return super.delete(key);
    }

    @Override
    T search(Object key) {
        // TODO Auto-generated method stub
        return super.search(key);
    }
}
