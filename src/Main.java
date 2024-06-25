import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter text to be encoded: ");
        String userText=scanner.nextLine();

        //generate dataTxt
        LinkedList dataTxt= CountCharFrequency.countCharFrequency(userText);
        System.out.println("\nPrinting data.txt before sorting");
        dataTxt.display();
        System.out.println("\nPrinting data.txt after sorting");
        dataTxt.sortLinkedList();
        dataTxt.display();

        //generate tree
        HuffmanTree huffmanTree=new HuffmanTree(dataTxt);
        HuffmanNode root= huffmanTree.generateHuffmanTree();
        System.out.println("\nPrinting Huffman Tree in Pre-order\n");
        huffmanTree.printHuffmanTree(root);

        //generate huffman code dictionary & display
        HuffmanCoding huffmanCoding=new HuffmanCoding();
        huffmanCoding.generateHuffmanCodeDictionary(root,"");
        huffmanCoding.huffmanCodeMap.displayHuffmanCodeDictionary();

        //generate and display encoded message
        String encodedMessage= huffmanCoding.encodeText(userText);
        System.out.println("\nEncoded Message: "+encodedMessage);
    }
}
