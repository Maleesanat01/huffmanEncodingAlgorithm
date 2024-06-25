public class LinkedList {
    public HuffmanNode head;

    //constructor
    public LinkedList(){
        head=null;
    }
    public void addToOrUpdateDataTxt(HuffmanNode node){
        if(head == null){
            head = node;
            node.weight=0;
            head.next= null;
        }
        //if char exists increment frequency
        HuffmanNode temp=head;
        while(temp != null){
            if(temp.symbol == node.symbol){
                temp.weight++;
                return;
            }
            temp=temp.next;
        }
        //if char not found add to head
        node.next= head;
        head=node;
    }

    public HuffmanNode getMiddle(HuffmanNode head){
        if(head == null){return null;}
        HuffmanNode slow=head;
        HuffmanNode fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //get two halves of linked list
    public HuffmanNode mergeSort(HuffmanNode head){
        if(head == null || head.next == null){
            return head;
        }

        HuffmanNode middle=getMiddle(head);
        HuffmanNode middleNext=middle.next;
        middle.next=null;

        //sort and join linked list halves
        return merge(mergeSort(head), mergeSort(middleNext));
    }

    public HuffmanNode merge(HuffmanNode left, HuffmanNode right){
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        HuffmanNode result;
        if(left.weight < right.weight){
            result=left;
            result.next=merge(left.next, right);
        }
        else{
            result=right;
            result.next=merge(left, right.next);
        }
        return result;
    }

    public HuffmanNode sortLinkedList(){
        this.head=mergeSort(this.head);
        return head;
    }

    //display data txt
    public void display(){
        HuffmanNode temp=head;
        while(temp != null){
            System.out.println("\n"+temp.symbol+" : "+temp.weight);
            temp=temp.next;
        }
    }
}


