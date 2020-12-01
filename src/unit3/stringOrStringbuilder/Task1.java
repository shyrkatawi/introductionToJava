package unit3.stringOrStringbuilder;

/**
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
class Task1 {
    static int getMaxNumberOfConsecutiveSpaces(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int maxCount = 0;
        int tmpCount = 0;
        char space = 32;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == space) {
                tmpCount++;
            } else {
                tmpCount = 0;
            }
            if (tmpCount > maxCount) {
                maxCount = tmpCount;
            }
        }
        return maxCount;
    }
}