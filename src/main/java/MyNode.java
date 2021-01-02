public class MyNode<K> {
    private MyNode next;
    private K  key;

    public MyNode(K key) {
        this.key=null;
        this.next=null;
    }
    public void setNext(MyNode next) {
        this.next = next;
    }
    public MyNode getNext() {
        return next;
    }
}