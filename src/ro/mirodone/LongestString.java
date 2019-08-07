package ro.mirodone;

public class LongestString {

    public  String longestConsec(String[] strarr, int k) {

        int arrayLength = strarr.length;
        if (arrayLength == 0 || k > arrayLength || k <= 0) {
            return "";
        }
        String word ;
        boolean stop = false;
        int maxLength = 0;
        String maxWord = "";
        for (int i = 0; i < strarr.length; i++) {
            word = "";
            for (int j = 0; j < k; j++) {
                if (i + j >= strarr.length) {
                    stop = true;
                    break;
                }
                word += strarr[i + j];
            }
            if (stop) {
                break;
            } else if (word.length() > maxLength) {
                maxLength = word.length();
                maxWord = word;
            }

        }
        return maxWord;
    }
}
