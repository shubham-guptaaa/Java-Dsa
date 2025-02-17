import java.util.HashSet;

class betterString {
    private static void countDistinctString(String up, String p, HashSet<String> set) {
        if (up.isEmpty()) {
            if (!p.isEmpty()) {
                set.add(p);
            }
            return;
        }
        char ch = up.charAt(0);
        countDistinctString(up.substring(1), p + ch, set);
        countDistinctString(up.substring(1), p, set);

    }

    public static String getDistinctSubstringCount(String str1, String str2) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        countDistinctString(str1, "", set1);
        countDistinctString(str2, "", set2);
        
        return set1.size() >= set2.size() ? str1 : str2;
    }

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "a";
        System.out.println(getDistinctSubstringCount(str1, str2));
    }
}
