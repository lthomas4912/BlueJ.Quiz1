
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = new StringBuffer(valueToBeReversed).reverse().toString();
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int length;
        int position;
        if(word.length() % 2 == 1){
            position = word.length() / 2 ;
            length = 1;
        } else {
            position = (word.length() / 2) - 1  ;
            length = 2;
        }return  word.charAt(position );
        
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String result = value;
        String newWord = result.replace("charToRemove", "");
        String lastWord = new String (newWord);
        
        return lastWord;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String words = sentence.substring(sentence.lastIndexOf(" ") + 1);
        return words;
       
    }
}
