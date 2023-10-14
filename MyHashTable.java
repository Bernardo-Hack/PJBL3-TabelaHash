public class MyHashTable <T> {
    private T[] values;
    private String[] keys;
    private int quantItems;

    @SuppressWarnings("unchecked")

    public MyHashTable(int size) {
        this.quantItems = 0;
        this.values = (T[]) new Object[size];
        this.keys = new String[size];
    }

    private boolean isAlmostFull() {
        if (this.quantItems >= this.keys.length * 0.75) {
            return true;

        } else {
            return false;
            
        }
    }

    private int getSize() {
        return this.keys.length;
    }

    private int getKeyPos(Object key) {
        if (key instanceof String) {
            // Código de espalhamento de chave String(deve ter 5 letras)
            String auxStr = key.toString();
            int auxInt = 0;

            for (int i = 5; i != -1; --i) {
                int ascii = (int) auxStr.charAt(i);
                auxInt += ascii * (2 * i);
            }

            return auxInt % this.getSize();

        } else if (key instanceof Integer){
            int auxInt = ((int)key);
            // Código de espalhamento de chave com Integer
            return auxInt % this.getSize();

        } else {
            System.out.println("Tipo de chave informada inválida!");
            return -1;
        }
    }

    void insert(Object key, T value) {
        if (this.isAlmostFull()) {
            this.doubleSize();
        }
        
        int keyPos = getKeyPos(key);

        if (keys[keyPos] == "null" || keys[keyPos] == null) {
            this.keys[keyPos] = key.toString();
            this.values[keyPos] = value;
            this.quantItems++;

        } else {
            int auxPos = keyPos + 1;

            while (true) {
                if (auxPos == this.getSize()) {
                    auxPos = 0;
                }

                if (auxPos == keyPos) {
                    System.out.println("Tabela está cheia! 💀");
                    break;
                }

                if (keys[auxPos] == "null" || keys[auxPos] == null) {
                    this.keys[keyPos] = key.toString();
                    this.values[keyPos] = value;
                    this.quantItems++;
                    break;
                } else {
                    auxPos++;
                }
            }
        }
    }

    T delete(T key) {
        int keyPos = getKeyPos(key);

        if (this.keys[keyPos] == key) {
            T rValue = this.values[keyPos];
            this.keys[keyPos] = "null";
            this.values[keyPos] = null;
            return rValue;

        } else {
            int auxPos = keyPos + 1;

            while (auxPos != keyPos) {
                if (auxPos == this.getSize()) {
                    auxPos = 0;
                }

                if (keys[auxPos] == key) {
                    T rValue = this.values[auxPos];
                    this.keys[auxPos] = "null";
                    this.values[auxPos] = null;
                    return rValue;

                } else {
                    auxPos++;
                }
            }
        }
        System.out.println("Valor não está na tabela! 💀");
        return null;
    }

    T search(T key) {
        int keyPos = getKeyPos(key);

        if (this.keys[keyPos] == key) {
            return this.values[keyPos];

        } else {
            int auxPos = keyPos + 1;

            while (auxPos != keyPos) {
                if (auxPos == this.getSize()) {
                    auxPos = 0;
                }

                if (keys[auxPos] == key) {
                    return this.values[auxPos];

                } else {
                    auxPos++;
                }
            }
        }
        return this.values[keyPos];
    }

    @SuppressWarnings("unchecked")

    private void doubleSize() {
        // função para dobrar o tamanho da tabela
        int size = this.keys.length * 2;
        T[] newValues = (T[]) new Object[size];
        String[] newKeys = new String[size];

        for (int i = 0; i < size / 2; i++) {
            if (this.keys[i] != null) {
                newKeys[i] = this.keys[i];
                newValues[i] = this.values[i];
            }
        }

        this.keys = newKeys;
        this.values = newValues;
    }

    void print() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println("[ " + this.keys[i] + " | " + this.values[i] + " ]");
        }
    }
}
