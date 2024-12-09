// package codevita;
import java.util.*;
public class SegmentDisplay {
    private static final Map<Integer, List<Character>> alp = new HashMap<>();

    static {
        alp.put(92229, Arrays.asList('A', 'D'));
        alp.put(93339, Arrays.asList('B'));
        alp.put(92222, Arrays.asList('C', 'F'));
        alp.put(93333, Arrays.asList('E'));
        alp.put(92336, Arrays.asList('G'));
        alp.put(91119, Arrays.asList('H', 'N', 'U'));
        alp.put(22322, Arrays.asList('I'));
        alp.put(62229, Arrays.asList('J'));
        alp.put(92226, Arrays.asList('K'));
        alp.put(91111, Arrays.asList('L'));
        alp.put(91519, Arrays.asList('M', 'W'));
        alp.put(72227, Arrays.asList('O'));
        alp.put(92225, Arrays.asList('P'));
        alp.put(92339, Arrays.asList('Q'));
        alp.put(93336, Arrays.asList('R'));
        alp.put(63336, Arrays.asList('S'));
        alp.put(11911, Arrays.asList('T'));
        alp.put(71117, Arrays.asList('V'));
        alp.put(22122, Arrays.asList('X'));
        alp.put(62226, Arrays.asList('Y'));
        alp.put(23332, Arrays.asList('Z'));
    }
    public static char checkChr(int s, String[] led) {
        StringBuilder valStr = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int t = 0;
            for (int j = 0; j < 9; j++) {
                t += led[j].charAt(s + i) - '0';
            }
            valStr.append(t);
        }
        int val = Integer.parseInt(valStr.toString());
        if (val == 91519) {
            return led[0].substring(s, s + 5).equals("11111") ? 'M' : 'W';
        } else if (val == 91119) {
            if (led[8].substring(s, s + 5).equals("11111")) return 'U';
            if (led[4].substring(s, s + 5).equals("11111")) return 'H';
            return 'N';
        } else if (val == 92222) {
            return led[4].substring(s, s + 5).equals("11111") ? 'F' : 'C';
        } else if (val == 92229) {
            return led[8].substring(s, s + 5).equals("11111") ? 'D' : 'A';
        } else {
            return alp.get(val).get(0);
        }
    }
    public static String solve(String[] led) {
        int tb = led[0].length();
        StringBuilder merged = new StringBuilder(led[0]);
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < tb; j++) {
                merged.setCharAt(j, (char) (merged.charAt(j) - '0' | led[i].charAt(j) - '0' + '0'));
            }
        }
        StringBuilder result = new StringBuilder();
        int s = 0;
        while (s < tb) {
            if (merged.charAt(s) == '1') {
                result.append(checkChr(s, led));
                s += 5;
            } else {
                s++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] led = new String[9];
        for (int i = 0; i < 9; i++) {
            led[i] = scanner.next();
        }
        System.out.println(solve(led));
        scanner.close();
    }
}
