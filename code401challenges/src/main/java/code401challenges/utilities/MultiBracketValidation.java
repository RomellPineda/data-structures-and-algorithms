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
            if (!s.isEmpty() && chr.equals(mappers.get(s.peek()))) {
                s.pop();
            }
            if (mappers.containsKey(chr) || chr.equals(mappers.get(chr))) {
                s.push(chr);
            }
        }

        return s.isEmpty();
    }
}
