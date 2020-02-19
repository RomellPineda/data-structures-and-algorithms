package code401challenges.RepeatedWord;

public class RepeatedWord {

    public static String repeatWord(String inputString) {
        String scrubInputString = inputString.replaceAll("[,:;.]", "").toLowerCase();
        String[] brokenUpStringArray = scrubInputString.split(" ");
        return repeatWord(brokenUpStringArray, 0, 1);
    }

    private static String repeatWord(String[] arr, int index, int current) {
        if (index == arr.length - 1) {
            return "no repeating words, brosef!";
        }
        for (int j = current; j < arr.length; j++) {
            if (arr[index].equals(arr[j])) {
                return arr[index];
            }
        }
        return repeatWord(arr, index + 1, current + 1);
    }
}
