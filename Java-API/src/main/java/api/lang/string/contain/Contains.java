package api.lang.string.contain;

/**
 * @Author: caopeng
 * @Description: 检查String是否包含搜索字符，并处理null。
 * @Date: Created in 11:13 2020/10/9
 */
public class Contains {

    /**
     * @Description: 检查String是否包含搜索字符，并处理null。
     *
     * This method uses String#indexOf(int).
     *
     * contains(null, *)    = false
     * contains("", *)      = false
     * contains("abc", 'a') = true
     * contains("abc", 'z') = false
     *
     * @Param:
     * @return:
     * @Author: caopeng
     * @Date: 2020/10/9
     */
    public static void main(String[] argv) throws Exception {
        String str = "demo2s.com";
        char searchChar = '.';
        System.out.println(contains(str, searchChar));
    }//w w  w  .  j av a 2s .c  o m

    public static boolean contains(String str, char searchChar) {
        if (isEmpty(str)) {
            return false;
        }
        //如果此字符在原字符串中不存在 则indexOf返回 -1
        System.out.println(str.indexOf('m'));

        return str.indexOf(searchChar) >= 0;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

}
