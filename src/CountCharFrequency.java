public class CountCharFrequency {
    //create dataTxt (characters with frequencies)
    public static LinkedList countCharFrequency(String userText) {
        LinkedList dataTxt = new LinkedList();
        for (int i = 0; i < userText.length(); i++) {
            char character = userText.charAt(i);
            if (Character.isDefined(character) || character == ' ') {
                HuffmanNode node=new HuffmanNode(character, 1);
                dataTxt.addToOrUpdateDataTxt(node);
            }
        }
        return dataTxt;
    }
}


