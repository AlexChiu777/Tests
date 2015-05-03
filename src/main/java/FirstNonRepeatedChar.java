import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Alex on 5/3/2015.
 */
public class FirstNonRepeatedChar {
    //finding the first non repeated character in the string teeters

    private HashMap<Character, Integer> characterHashMap = new HashMap<Character, Integer>();

    private void parseStringToHashMap(String input) {
        for (int i=0; i<input.length(); i++) {
            if (characterHashMap.get(input.charAt(i)) == null) {
                characterHashMap.put(input.charAt(i), 1);
            } else {
                int count = characterHashMap.get(input.charAt(i));
                characterHashMap.put(input.charAt(i), count++);
            }
        }
    }

    private void printFirstNonRepeatedChar() {
        Iterator it = characterHashMap.entrySet().iterator();

        while (it.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) it.next();

            if ((Integer)entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        String input = "teeters";

        FirstNonRepeatedChar firstNonRepeatedChar = new FirstNonRepeatedChar();
        firstNonRepeatedChar.parseStringToHashMap(input);

        firstNonRepeatedChar.printFirstNonRepeatedChar();
    }







}
