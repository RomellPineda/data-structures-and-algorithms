package code401challenges.utilities;

import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        HashMap<String, String> mappers = new HashMap<>();
        Stack s = new Stack();

        mappers.put("(", ")");
        mappers.put("[", "]");
        mappers.put("{", "}");

        String[] cut = input.split("");
        for (String chr : cut) {
            if (mappers.containsKey(chr)) {
                s.push(chr);
            }
            if (!s.isEmpty() && chr.equals(mappers.get(s.peek()))) {
                s.pop();
            };
        }

        return s.isEmpty();
    }
}
