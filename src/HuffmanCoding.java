public class HuffmanCoding {
    HuffmanCodeMap huffmanCodeMap=new HuffmanCodeMap();
    public void generateHuffmanCodeDictionary(HuffmanNode node, String code){
        if(node == null){
            return;
        }
        else{
            //recursive left subtree traverse and add 0 to huffman code
            generateHuffmanCodeDictionary(node.leftChild, code + "0");

            //recursive right subtree traverse and add 1 to huffman code
            generateHuffmanCodeDictionary(node.rightChild, code + "1");

            if(node.symbol != '$'){
                huffmanCodeMap.put(node.symbol, code);
            }
        }
    }

    public String encodeText(String userText){
        StringBuilder encodedUserText = new StringBuilder();
        for (int i = 0; i < userText.length(); i++) {
            char character = userText.charAt(i);
            String huffmanCode=huffmanCodeMap.get(character);
            if(huffmanCode != null){
                encodedUserText.append(huffmanCode);
            }
        }
        return encodedUserText.toString();
    }
}

