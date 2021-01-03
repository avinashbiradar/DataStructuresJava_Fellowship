public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
    public MyLinkedList() {
        this.head=head;
        this.tail=tail;
    }
    public void add(INode<K> newNode) {
        if(this.tail==null) {
            this.tail=newNode;
        }
        if(this.head==null) {
            this.head=newNode;
        }
        else {
            INode<K> tempNode=this.head;
            //INode newNode;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }
    public void addElement(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
            this.tail = newNode;
        }
    }
    //Method to insert after a specified element
    public void insert(INode destNode, INode newNode) {
        INode tempNode = this.head;
        while (!tempNode.getKey().equals(destNode.getKey())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }
    //Method to Delete first Element
    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    //Method to delete last element
    public INode popLast() throws NullPointerException {
        if (this.head == null)
            return null;
        if (this.head.getNext().equals(null))
            return null;
        else {
            INode tempNode = head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }
            INode tempLastNode = tempNode.getNext();
            tempLastNode.setNext(null);
            return tempLastNode;
        }
    }
    public void printMyNodes() {
        StringBuffer myNodes=new StringBuffer("My Nodes: ");
        INode tempNode=head;
        while(tempNode.getNext()!=null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
