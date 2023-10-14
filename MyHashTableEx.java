public class MyHashTableEx <T> extends MyHashTable <T> {
    protected MyLinkedList<T>[] values;
    protected MyLinkedList<String>[] keys;

    public MyHashTableEx(int size) {
        super(size);
    }

    @Override
    void insert(Object key, T value) {
        if (this.isAlmostFull()) {
            this.doubleSize();
        }
        
        int keyPos = getKeyPos(key);

        if (this.keys[keyPos] == null) {
            this.keys[keyPos] = new MyLinkedList<String>(key.toString());
            this.values[keyPos] = new MyLinkedList<T>(value);

        } else if (this.keys[keyPos] != null) {
            this.keys[keyPos].addValue(key.toString());
            this.values[keyPos].addValue(value);
        }

        this.quantItems++;
    }

    @Override
    T delete(Object key) {
        /*
         * Parecido com o método de busca mas fazer uma pira parecida
         * com o da árvore, de armazenar o nó anterior ao que será
         * deletado, e substituir a referencia de next do nó
         * (this.next = this.next.next)
         */
        return super.delete(key);
    }

    @Override
    T search(Object key) {
        int keyPos = getKeyPos(key);

        /* 
         * Iterar pelas 2 linked lists ao mesmo tempo (while por exemplo)
         * checando a lista de chaves até encontrar o node correto
         * então retornar o nó da lista de valores.
         */
        return super.search(key);
    }
}
