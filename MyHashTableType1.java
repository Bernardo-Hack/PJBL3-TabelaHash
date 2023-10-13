import java.lang.reflect.Array;

public class MyHashTableType1 <T> {
    private T[] values;
    private String[] keys;
    private int quantItems;

    @SuppressWarnings("unchecked")

    public MyHashTableType1(Class<T> ct, int size) {
        this.quantItems = 0;
        this.values = (T[]) Array.newInstance(ct, size);
        this.keys = new String[size];
    }

    private boolean isAlmostFull() {
        if (this.getSize() >= this.keys.length * 0.75) {
            return true;

        } else {
            return false;
            
        }
    }

    private int getSize() {
        return this.quantItems;
    }

    void insert(T key, T value) {
        if (this.isAlmostFull()) {
            this.doubleSize();
        }
        
        if (key instanceof String) {
            // Código de espalhamento de chave String(deve ter 5 letras)
            String auxStr = key.toString();
            int auxInt = 0;

            for (int i = 5; i != -1; --i) {
                int ascii = (int) auxStr.charAt(i);
                auxInt += ascii * (2 * i);
            }

            int pos = auxInt % this.getSize();
            this.keys[pos] = key.toString();
            this.values[pos] = value;

        } else {
            // Código de espalhamento de chave com Integer

        }

        this.quantItems++;
    }

    T delete(T value) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    void search(T value) {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    void doubleSize() {
        // função para dobrar o tamanho da tabela
    }

    void print() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println("[ " + this.keys[i] + " | " + this.values[i] + " ]");
        }
    }
}
