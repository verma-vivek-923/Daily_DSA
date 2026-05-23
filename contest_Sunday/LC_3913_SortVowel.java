import java.util.HashMap;

import java.util.*;

class Solution {

    public String sortVowels(String s) {

        // frequency map
        HashMap<Character, Integer> freq =
            new HashMap<>();


        // vowel indices
        ArrayList<Integer> idx =
            new ArrayList<>();


        // count vowels
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(isVowel(ch)) {

                idx.add(i);

                freq.put(
                    ch,
                    freq.getOrDefault(ch, 0) + 1
                );
            }
        }


        // sort vowels by:
        // 1. frequency descending
        // 2. first occurrence order

        ArrayList<Character> vowels =
            new ArrayList<>(freq.keySet());


        vowels.sort((a,b) -> {

            int fa = freq.get(a);

            int fb = freq.get(b);

            // higher frequency first
            if(fa != fb) {

                return fb - fa;
            }

            // same frequency:
            // first occurrence order
            return s.indexOf(a) - s.indexOf(b);
        });


        // build sorted vowel sequence
        ArrayList<Character> sorted =
            new ArrayList<>();


        for(char ch : vowels) {

            int count = freq.get(ch);

            while(count-- > 0) {

                sorted.add(ch);
            }
        }


        // modify string
        StringBuilder sb =
            new StringBuilder(s);


        for(int i = 0; i < idx.size(); i++) {

            sb.setCharAt(
                idx.get(i),
                sorted.get(i)
            );
        }


        return sb.toString();
    }


    // vowel checker
    boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}

public class LC_3913_SortVowel {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.sortVowels("leetcode"));
    }
}
