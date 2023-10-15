import java.util.LinkedList;

public class MyHashTableEx <T> {
    private LinkedList<MyNode>[] table;
    private int quantItems;

    private class MyNode {
        private T value;
        private String key;

        public MyNode(T value, String key) {
            this.value = value;
            this.key = key;
        }

        public T getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }
    }

    @SuppressWarnings("unchecked")

    public MyHashTableEx(int size) {
        this.quantItems = 0;
        this.table = (LinkedList[]) new LinkedList[size];
    }

    private boolean isAlmostFull() {
        if (this.quantItems >= this.table.length * 0.75) {
            return true;
            
        } else {
            return false;
            
        }
    }

    private int getSize() {
        return this.table.length;
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

        if(this.table[keyPos] == null) {
            this.table[keyPos] = new LinkedList<MyNode>();
        }

        LinkedList<MyNode> list = this.table[keyPos];

        list.add(new MyNode(value, key.toString()));
        this.quantItems++;
    }

    T delete(Object key) {
        int keyPos = getKeyPos(key);
        LinkedList<MyNode> list = this.table[keyPos];

        for (MyNode node : list) {
            if (node.getKey().equals(key.toString())) {
                T rValue = node.getValue();
                list.remove(node);
                this.quantItems--;
                return rValue;
            }
        }

        System.out.println("Valor não está na tabela! 💀");
        return null;
    }
    
    T search(Object key) {
        int keyPos = getKeyPos(key);
        LinkedList<MyNode> list = this.table[keyPos];

        for (MyNode node : list) {
            if (node.getKey().equals(key.toString())) {
                return node.getValue();
            }
        }

        System.out.println("Valor não está na tabela! 💀");
        return null;
    }

    @SuppressWarnings("unchecked")

    private void doubleSize() {
        // função para dobrar o tamanho da tabela
        int size = this.table.length * 2;
        LinkedList<MyNode>[] newTable = (LinkedList[]) new LinkedList[size];

        for (int i = 0; i < size / 2; i++) {
            if (this.table[i] != null) {
                newTable[i] = this.table[i];
            }
        }
        this.table = newTable;
    }

    void print() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println("[ " + this.table[i] + " ]");
        }
    }

    public int getQuantItems() {
        // Tá aqui só p testar se ta funcionando certinho
        return quantItems;
    }
}
