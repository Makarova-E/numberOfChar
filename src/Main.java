import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
            " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat." +
            " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
            "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia" +
            " deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (!map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), 1);
            } else {
                map.put(text.charAt(i), (map.get(text.charAt(i)) + 1));
            }
        }
        int maxRepeat = -1;
        //char symbolMax = Character.MIN_VALUE;;
        Character symbolMax = null;
        for (Character key : map.keySet()) {
            if (map.get(key) > maxRepeat) {
                maxRepeat = map.get(key);
                symbolMax = key;
            }
        }
        Character symbolMin = null;
        int minRepeat = Integer.MAX_VALUE;
        for (Character key : map.keySet()) {
            if (map.get(key) < minRepeat) {
                minRepeat = map.get(key);
                symbolMin = key;
            }
        }
        System.out.println("Чаще всего встречался символ \"" + symbolMax + "\" - " + maxRepeat + " раз");
        System.out.println("Реже всего встречался символ \"" + symbolMin + "\" - " + minRepeat + " раз");
    }
}
