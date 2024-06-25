public class LinkedListQueue {
    private HuffmanNode front;
    private HuffmanNode back;
    private int size;

    public void setFront(HuffmanNode front) {
        this.front = front;
    }
    public void setBack(HuffmanNode back) {
        this.back = back;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public HuffmanNode getFront() {
        return front;
    }
    public HuffmanNode getBack() {
        return back;
    }
    public int getSize() {
        return size;
    }

    //constructor
    public LinkedListQueue(){
        this.front=null;
        this.back=null;
        this.size=0;
    }

    //enqueue internal nodes to queue2
    public void enqueue(HuffmanNode huffmanTreeNode){
        if(back == null){
            front=back=huffmanTreeNode;
        }else{
            back.next=huffmanTreeNode;
            back=huffmanTreeNode;
        }
        size++;
    }

    //enqueue readily built & sorted leaf nodes from dataTxt to queue1
    public void enqueueSortedDataTxt(LinkedList sortedDataTxt){
        HuffmanNode current=sortedDataTxt.head;
        while(current != null) {
            enqueue(current);
            current=current.next;
        }
    }

    //dequeue min weighted node
    public static HuffmanNode dequeueMinHuffmanNode(LinkedListQueue queue1, LinkedListQueue queue2){
        HuffmanNode dequeuedNode;
        if(queue1.isEmpty() && queue2.isEmpty()){
            return null;
        }
        else if(queue1.isEmpty()){
            dequeuedNode=queue2.pollQueue();
        }
        else if(queue2.isEmpty()){
            dequeuedNode=queue1.pollQueue();
        }
        else if(queue1.peekQueue().weight <= queue2.peekQueue().weight){
                dequeuedNode=queue1.pollQueue();
        }
        else{
            dequeuedNode=queue2.pollQueue();
        }
        return dequeuedNode;
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }

    public HuffmanNode peekQueue(){
        if(isEmpty() == true){
            System.out.println("Queue is empty, no peek");
            return null;
        }
        return front;
    }

    public HuffmanNode pollQueue(){
        if(isEmpty() == true){
            System.out.println("Queue is empty, no poll");
            return null;
        }
        HuffmanNode temp=front;
        front=front.next;

        if(front == null){
            back = null;
        }
        size--;
        return temp;
    }
}


