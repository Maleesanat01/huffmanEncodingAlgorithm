public class HuffmanTree {
    static LinkedListQueue queue1;
    static LinkedListQueue queue2;
    public HuffmanTree(LinkedList sortedDataTxt){
        queue1 = new LinkedListQueue();
        queue2 = new LinkedListQueue();
        //enqueue sorted leaf nodes from dataTxt to queue 1
        queue1.enqueueSortedDataTxt(sortedDataTxt);
    }

    public HuffmanNode generateHuffmanTree(){
        HuffmanNode dequeuedNode1;
        HuffmanNode dequeuedNode2;

        //dequeue, create internal nodes and enqueue to queue2 //7n+1
        while(queue1.getSize() + queue2.getSize() > 1){
            dequeuedNode1= LinkedListQueue.dequeueMinHuffmanNode(queue1,queue2);
            dequeuedNode2= LinkedListQueue.dequeueMinHuffmanNode(queue1,queue2);

            HuffmanNode internalNode= new HuffmanNode('$',dequeuedNode1.weight+dequeuedNode2.weight);
            internalNode.leftChild=dequeuedNode1;
            internalNode.rightChild=dequeuedNode2;
            queue2.enqueue(internalNode);
        }
            return queue2.peekQueue(); //return root
   }

    //recursive pre-order tree print
    public void printHuffmanTree(HuffmanNode root){
        if(root == null){
            System.out.println("No Tree");
        }
        System.out.println("|─");
        System.out.println(root.symbol + " (" + root.weight + ")");

        if (root.leftChild != null){
            printHuffmanTree(root.leftChild);
        }
        if (root.rightChild != null){
            printHuffmanTree(root.rightChild);
        }
    }
}

