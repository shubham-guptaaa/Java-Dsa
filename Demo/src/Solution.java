import java.util.ArrayList;
import java.util.List;
// import java.util.PriorityQueue;

class Solution {
    private static String largest = "";

    public static void generateSplits(String word, int start, int partsLeft, List<String> currentSplit) {
        int n = word.length();
        if (partsLeft == 1) {
            // Add the remaining part of the word as the last part
            String lastPart = word.substring(start);
            for (String s : currentSplit) {
                // Update the largest value found so far
                if (s.compareTo(largest) > 0) {
                    largest = s;
                }
            }
            if (lastPart.compareTo(largest) > 0) {
                largest = lastPart;
            }
            return;
        }
        for (int i = start + 1; i <= n - partsLeft + 1; i++) {
            String currentPart = word.substring(start, i);
            currentSplit.add(currentPart);
            generateSplits(word, i, partsLeft - 1, currentSplit);
            currentSplit.remove(currentSplit.size() - 1);
        }
    }

    public static String answerString(String word, int numFriends) {
        largest = "";
        generateSplits(word, 0, numFriends, new ArrayList<>());
        return largest;
    }

    public static void main(String[] args) {
        // Example usage:
        String word = "bif";
        int numFriends = 2;
        System.out.println(answerString(word, numFriends)); // Output the largest string
    }
}