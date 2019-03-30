package com.zipcoder.quiz5;

import java.util.*;

public class CommonWord {

    /**
     * Read the text and count each word in the text. Return the word and its
     * count in descending order to see what's the common word used in the text.
     * Store the word and its count in an Entry object.
     * @param text
     * @return a list of word and its count in descending order stored in the object entry
     */
    public List<Entry> getCommonWord(String text) {
        List<String> textList = Arrays.asList(text.toLowerCase().split(" "));
        Set<String> textSet = new HashSet<>(textList);
        List<Entry> entries = new ArrayList<>();
        for(String s: textSet){
            entries.add(new Entry(s,0));
        }
        for (int j =0; j<entries.size();j++) {
            for (int i = 0; i < textList.size(); i++) {
                if (textList.get(i).equals(entries.get(j).getWord())) {
                    entries.get(j).incrementCount();
                }
            }
        }
        entries.sort(Comparator.comparing(Entry::getCount).reversed());
        System.out.println(entries.toString());
        return entries;
    }
}
