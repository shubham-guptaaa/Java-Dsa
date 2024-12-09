import java.util.*;
public class Help {
    public static int[] getMaxPrefixLengthAndDeletions(String subStr, String targetStr, int sIdx) {
        int idx = 0;
        int tIdx = sIdx;
        int matchLen = 0;
        while (idx < subStr.length() && tIdx < targetStr.length()) {
            if (subStr.charAt(idx) == targetStr.charAt(tIdx)) {
                matchLen++;
                tIdx++;
            }
            idx++;
        }
        int totalDeletions = subStr.length() - matchLen;
        return new int[] { matchLen, totalDeletions };
    }
    public static void processInput() {
        Scanner sc = new Scanner(System.in);
        int numStr = Integer.parseInt(sc.nextLine().trim());
        List<String> p = new ArrayList<>();
        for (int i = 0; i < numStr; i++) {
            p.add(sc.nextLine().trim());
        }
        String target = sc.nextLine().trim();
        int maxDeletions = Integer.parseInt(sc.nextLine().trim());
        int size = target.length();
        int largeNum = Integer.MAX_VALUE;
        int[] minDeletions = new int[size + 1];
        Arrays.fill(minDeletions, largeNum);
        minDeletions[0] = 0;
        for (int idx = 0; idx < size; idx++) {
            if (minDeletions[idx] == largeNum) {
                continue;
            }
            for (String i : p) {
                int[] result = getMaxPrefixLengthAndDeletions(i, target, idx);
                int length = result[0];
                int deletions = result[1];
                if (length == 0) {
                    continue; 
                }
                int nidx = idx + length;
                if (nidx > size) {
                    continue;
                }
                minDeletions[nidx] = Math.min(minDeletions[nidx], minDeletions[idx] + deletions);
            }
        }
        if (minDeletions[size] <= maxDeletions) {
            System.out.println("Possible");
        } else if (minDeletions[size] == largeNum) {
            System.out.println("Impossible");
        } else {
            int longestPos = -1;
            for (int idx = size; idx >= 0; idx--) {
                if (minDeletions[idx] <= maxDeletions) {
                    longestPos = idx;
                    break;
                }
            }
            if (longestPos > 0) {
                System.out.println(target.substring(0, longestPos).trim());
            } else {
                System.out.println("Nothing");
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        processInput();
    }
}
