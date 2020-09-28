package lang.string;

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
    }

    public static String capitalize(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return str;
        }
        //subString()的参数为 角标1 到最后
        return new StringBuffer(strLen).append(Character.toTitleCase(str.charAt(0))).append(str.substring(1))
                .toString();
    }
}
