public class Stack {
    
    private Node top;
    private Integer size;

    public Node getTop() {
        return top;
    }

    private void setTop(Node top) {
        this.top = top;
    }

    public Integer getSize() {
        return size;
    }
    
    private void increaseSize() {
        size++;
    }

    private void decreaseSize() {
        size--;
    }

    public void push(Node insertedNode) {
        insertedNode.setPreviousNode(top);
        setTop(insertedNode);
        increaseSize();
    }
    
    public Node pop() {
        Node removedNode = top;
        setTop(top.getPreviousNode());
        removedNode.setPreviousNode(null);
        decreaseSize();
        return removedNode;
    }
}
