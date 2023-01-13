public class Stack {
    
    private Node top;
    private Node base;
    private int size;

    public Node getTop() {
        return top;
    }

    private void setTop(Node top) {
        this.top = top;
    }

    public Node getBase() {
        return base;
    }

    private void setBase(Node base) {
        this.base = base;
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
        if (isEmpty()) {
            setBase(insertedNode);
        }
        
        insertedNode.setPreviousNode(top);
        setTop(insertedNode);
        increaseSize();
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public Node pop() {
        Node removedNode = top;
        setTop(top.getPreviousNode());
        removedNode.setPreviousNode(null);
        decreaseSize();

        if (isEmpty()) {
            setBase(null);
        }

        return removedNode;
    }

    public void changeBase(Node newBase) {
        base.setPreviousNode(newBase);
        setBase(newBase);
        increaseSize();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node assistantNode = top;

        while (assistantNode != null) {
            stringBuilder.append(assistantNode.toString() + " ");
            assistantNode = assistantNode.getPreviousNode();
        }

        return stringBuilder.toString();
    }
}
