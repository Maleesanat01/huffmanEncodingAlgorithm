public class HuffmanNode {
    public char symbol;
    public int weight;
    public HuffmanNode leftChild;
    public HuffmanNode rightChild;
    public HuffmanNode next;

    //constructor
    public HuffmanNode (Character symbol, int weight) {
        this.symbol=symbol;
        this.weight=weight;
        leftChild=null;
        rightChild=null;
        next=null;
    }
}

