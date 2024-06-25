public class HuffmanCodeMap{
    public String[] huffmanCodeDictionary;
    int index;

    //constructor
    public HuffmanCodeMap(){
        huffmanCodeDictionary= new String[128];
    }

    public void put(char key, String value){
        index=  key; //character's ascii (key) as array index
        if(index < huffmanCodeDictionary.length){
            huffmanCodeDictionary[index]=value; //value as huffman code
        }else{
            System.out.println("Index out of bounds");
        }
    }

    public String get(char key){
        index=  key;
        if(index < huffmanCodeDictionary.length){
            return huffmanCodeDictionary[index];
        }else{
            return null;
        }
    }

    public void displayHuffmanCodeDictionary(){
        System.out.println("\nPrinting huffman code dictionary...\n");
        for(int i=0; i<huffmanCodeDictionary.length; i++){
            if(huffmanCodeDictionary[i] != null){
               char key=(char) i; //convert ascii back to its character
                System.out.println("Character: "+ key + ", Huffman code: "+ huffmanCodeDictionary[i]);
            }
        }
    }
}


