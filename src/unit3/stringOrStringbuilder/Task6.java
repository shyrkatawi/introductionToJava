package unit3.stringOrStringbuilder;


/**
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    static String addAfterEveryCharCopyOfChar(String str) {
        if(str.length()==0){
            return str;
        }
        char[] array = new char[str.length() * 2];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            array[index] = str.charAt(i);
            index++;
            array[index] = str.charAt(i);
            index++;
        }
        return String.valueOf(array);
    }
}
