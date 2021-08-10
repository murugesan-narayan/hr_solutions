package eltest.livecoding;

import java.util.*;

public class Challenge {
    /**
     * Given a string S and a set of words D, find the longest word in D that is a subsequence of S.
     *
     * Word W is a subsequence of S if some number of characters, possibly zero, can be deleted from S to form W, without reordering the remaining characters.
     *
     * Note: D can appear in any format : list, hash table, prefix tree, etc.
     *
     * For example, given the input :
     *
     * S = "abppplee"
     * D = {"able", "ale", "apple", "bale", "kangaroo"}
     * The correct output would be "apple"
     *
     * The words "able" and "ale" are both subsequences of S, but they are shorter than "apple".
     * The word "bale" is not a subsequence of S because even though S has all the right letters, they are not in the right order.
     * The word "kangaroo" is the longest word in D, but it isn't a subsequence of S.
     *
     * @param S - Sequence to check the subsequences
     * @param D - Array of subsequences to checked
     * @return - The Longest matching subsequence
     */
    public String solution(String S, String[] D) {
        Arrays.sort(D, Comparator.comparing(String::length));
        System.out.println("D = " + Arrays.toString(D));

        for (int i = D.length-1; i >= 0; i--) {
            //check if sub-sequence
            if (isSubSequence(D[i], S)) {
                return D[i];
            }
        }

        return null;
    }

    private boolean isSubSequence(String subSequence, String sequence) {
        System.out.println("subSequence = " + subSequence);
        int j= -1;
        int ci = -1;
        boolean inSubSeq = true;
        for (int i = 0; i < sequence.length() && i < subSequence.length(); i++) {
            char c = subSequence.charAt(i);
            ci = sequence.indexOf(c, ci + 1);
            if ( ci <= j) {
                inSubSeq = false;
                break;
            }
        }
        return inSubSeq;
    }


}
