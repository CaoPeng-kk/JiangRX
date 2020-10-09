package lang.string.casechar;

/**
 * @Author: caopeng
 * @Description: 将输入的字符串首字母变为大写
 * @Date: Created in 19:48 2020/9/28
 */
public class Capitalize {

    /**
     * A null input String returns null.
     *
     * capitalize(null)  = null
     * capitalize("")    = ""
     * capitalize("cat") = "Cat"
     * capitalize("cAt") = "CAt"
     * This solution is using StringBuffer.
     */
    public static void main(String[] args) {

        String str = "java";
        String res = capitalize(str);
        System.out.println(res);
        System.out.println();

        //capitalizeVtwo --test
        String s = "demo2s.com";
        System.out.println(capitalizeVTwo(s));
        System.out.println();

        //capitalizeString --test
        String sss = "demo2s.com demo";
        System.out.println(capitalizeString(sss));
    }

    /**
     * @Description: 将一个字符串的首字母变大写
     * @Param:
     * @return:
     * @Author: caopeng
     * @Date: 2020/9/28
     */
    public static String capitalize(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }
        //subString()的参数为 角标1 到最后
        return new StringBuffer(strLen).append(Character.toTitleCase(str.charAt(0))).append(str.substring(1))
                .toString();
    }
    
    /**
     * @Description: 如果返回的字符串的第一个字符为非字母，或者第一个字符已经为大写，
     *               者指定的字符串长度为0，则其值将与指定的字符串相同。
     * For example:
     * capitalize("foo bar").equals("Foo bar");
     * capitalize("2b or not 2b").equals("2b or not 2b")
     * capitalize("Foo bar").equals("Foo bar");
     * capitalize("").equals("");
     *
     * @Param:
     * @return:
     * @Author: caopeng
     * @Date: 2020/10/9
     */
    public static String capitalizeVTwo(String s) {
        if (s.length() == 0) {
            return s;
        }
        char first = s.charAt(0);
        char capitalized = Character.toUpperCase(first);
        return (first == capitalized) ? s : capitalized + s.substring(1);
    }

    /**
     * @Description: 将一个字符串以空格符分开，然后空格符为标准 将首字母大写
     * @Param:
     * @return:
     * @Author: caopeng
     * @Date: 2020/10/9
     */
    public static String capitalizeString(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }
        StringBuffer buffer = new StringBuffer(strLen);
        boolean whitespace = true;
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            if (Character.isWhitespace(ch)) {
                buffer.append(ch);
                whitespace = true;
            } else if (whitespace) {
                buffer.append(Character.toTitleCase(ch));
                whitespace = false;
            } else {
                buffer.append(ch);
            }
        }
        return buffer.toString();
    }
}
