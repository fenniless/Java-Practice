package com.zipcoder.quiz5;

import java.util.*;

public class MissingCharacter {
    /**
     * Given a text, return a list of all the characters that are missing from
     * the text. For example, if the text is `abc`, then the missing chars
     * are `defghijklmnopqrstuvwxyz`.
     * @param text
     * @return a list of all the missing characters from the text
     */
    public List<Character> getMissingChars(String text) {
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> alphaList = Arrays.asList(alpha);
        List<Character> missingChars = new ArrayList<>();
        text = text.replaceAll(" ","").toLowerCase();
        List<String> testList = Arrays.asList(text.split(""));
        Collections.sort(testList);
        Set<String> testSet = new HashSet<>(testList);
        System.out.println(testSet);
        for(int i=0 ; i< alpha.length;i++){
            if (!testList.contains(alpha[i])){
                missingChars.add(alpha[i].charAt(0));
            }
        }
        return missingChars;
    }
}
