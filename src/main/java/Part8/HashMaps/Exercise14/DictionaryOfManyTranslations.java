package Part8.HashMaps.Exercise14;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.dict.containsKey(word)) {
            ArrayList<String> previous = dict.get(word);
            previous.add(translation);
            this.dict.put(word, previous);
        } else {
            ArrayList<String> arrList = new ArrayList();
            arrList.add(translation);
            this.dict.put(word, arrList);
        }
    }

    public ArrayList<String> translate(String word) {
        if (!this.dict.containsKey(word)) {
            return new ArrayList();
        } else {
            return this.dict.get(word);
        }
    }

    public void remove(String word) {
        if (this.dict.containsKey(word)) {
            this.dict.remove(word);
        }
    }
}
