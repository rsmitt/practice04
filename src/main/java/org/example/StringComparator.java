package org.example;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        //Anna Anton

        int firstStringLen = o1.length();
        int secondStringLen = o2.length();
        char firstStringChars[] = o1.toCharArray();
        char secondStringChars[] = o2.toCharArray();
        int lim = Math.min(firstStringLen, secondStringLen);

        int i = 0;
        while (i < lim) {
            char firstStringChar = firstStringChars[i];
            char secondStringChar = secondStringChars[i];

            if (firstStringChar != secondStringChar) {
                return firstStringChar - secondStringChar;
            }
            ++i;
        }
        return firstStringLen - secondStringLen;
    }
}
