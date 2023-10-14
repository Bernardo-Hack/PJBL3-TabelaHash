public class MyLinkedList <T> {
    MyNode<T> base;

    private class MyNode<T> {
        T value;
        MyNode<T> next;

        public MyNode(T value) {
            this.value = value;
            this.next = null;
        }

        public void setNext(MyNode<T> next) {
            this.next = next;
        }

        public MyNode<T> getNext() {
            return this.next;
        }

        public T getValue() {
            return this.value;
        }
    }

    public MyLinkedList(T value) {
        this.base = new MyNode<T>(value);
    }

    public void addValue(T value) {
        MyNode<T> auxNode = getLastNode();
        auxNode.setNext(new MyNode<T>(value));
    }

    private MyNode<T> getLastNode() {
        return getLastRecur(this.base);
    }

    private MyNode<T> getLastRecur(MyNode<T> node) {
        if (node.getNext() == null) {
            return node;
        } else {
            return getLastRecur(node.next);
        }
    }
}
