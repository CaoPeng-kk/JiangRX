package api.lang.string.contain;

/**
 * @Author: caopeng
 * @Description: Java字符串仅包含某些字符（仅包含给定字符数组中的全部或部分字符）,
 *               字符串abab仅包含字符数组{a,b,c}中的 a b
 * @Date: Created in 15:59 2020/10/9
 */
public class ContainsOnly {

    public static void main(String[] argv) throws Exception {
        String str = "abab";
        char[] valid = new char[] {'a','b','c'};
        System.out.println(containsOnly(str, valid));
    }/* www .ja v  a  2  s . c om*/

    /**
     * <p>
     * Checks if the String contains only certain characters.
     * </p>
     *
     * <p>
     * A <code>null</code> String will return <code>false</code>. A
     * <code>null</code> valid character array will return <code>false</code>. An
     * empty String ("") always returns <code>true</code>.
     * </p>
     *
     * <pre>
     * containsOnly(null, *)       = false
     * containsOnly(*, null)       = false
     * containsOnly("", *)         = true
     * containsOnly("ab", '')      = false
     * containsOnly("abab", 'abc') = true
     * containsOnly("ab1", 'abc')  = false
     * containsOnly("abz", 'abc')  = false
     * </pre>
     *
     * @param str
     *          the String to check, may be null
     * @param valid
     *          an array of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     */
    public static boolean containsOnly(String str, char[] valid) {
        // All these pre-checks are to maintain API with an older version
        if ((valid == null) || (str == null)) {
            return false;
        }
        if (str.length() == 0) {
            return true;
        }
        if (valid.length == 0) {
            return false;
        }
        return indexOfAnyBut(str, valid) == -1;
    }

    /**
     * <p>
     * Checks if the String contains only certain characters.
     * </p>
     *
     * <p>
     * A <code>null</code> String will return <code>false</code>. A
     * <code>null</code> valid character String will return <code>false</code>. An
     * empty String ("") always returns <code>true</code>.
     * </p>
     *
     * <pre>
     * containsOnly(null, *)       = false
     * containsOnly(*, null)       = false
     * containsOnly("", *)         = true
     * containsOnly("ab", "")      = false
     * containsOnly("abab", "abc") = true
     * containsOnly("ab1", "abc")  = false
     * containsOnly("abz", "abc")  = false
     * </pre>
     *
     * @param str
     *          the String to check, may be null
     * @param validChars
     *          a String of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 2.0
     */
    public static boolean containsOnly(String str, String validChars) {
        if (str == null || validChars == null) {
            return false;
        }
        return containsOnly(str, validChars.toCharArray());
    }

    /** 搜索字符串以查找给定集中未包含的任何字符的第一个索引字符。
     *  -1 代表输入为空或者没有匹配到值
     *  如果字符串中的某个字符没有在对应的额数组中查询到，则返回未查询到的字符在数组中的角标
     * <p>
     * Search a String to find the first index of any character not in the given set
     * of characters.
     * </p>
     *
     * <p>
     * A <code>null</code> String will return <code>-1</code>. A <code>null</code>
     * or zero length search array will return <code>-1</code>.
     * </p>
     *
     * <pre>
     * indexOfAnyBut(null, *)           = -1
     * indexOfAnyBut("", *)             = -1
     * indexOfAnyBut(*, null)           = -1
     * indexOfAnyBut(*, [])             = -1
     * indexOfAnyBut("zzabyycdxx",'za') = 3
     * indexOfAnyBut("zzabyycdxx", '')  = 0
     * indexOfAnyBut("aba", 'ab')       = -1
     * </pre>
     *
     * @param str
     *          the String to check, may be null
     * @param searchChars
     *          the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     */
    public static int indexOfAnyBut(String str, char[] searchChars) {
        if (isEmpty(str) || isArrayEmpty(searchChars)) {
            return -1;
        }
        outer: for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < searchChars.length; j++) {
                if (searchChars[j] == ch) {
                    continue outer;
                }
            }
            return i;
        }
        return -1;
    }

    /**
     * <p>
     * Checks if a String is empty ("") or null.
     * </p>
     *
     * <pre>
     * isEmpty(null)      = true
     * isEmpty("")        = true
     * isEmpty(" ")       = false
     * isEmpty("bob")     = false
     * isEmpty("  bob  ") = false
     * </pre>
     *
     * <p>
     * NOTE: This method changed in Lang version 2.0. It no longer trims the String.
     * That functionality is available in isBlank().
     * </p>
     *
     * @param str
     *          the String to check, may be null
     * @return <code>true</code> if the String is empty or null
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * <p>
     * Checks if an array of primitive chars is empty or <code>null</code>.
     * </p>
     *
     * @param array
     *          the array to test
     * @return <code>true</code> if the array is empty or <code>null</code>
     * @since 2.1
     */
    public static boolean isArrayEmpty(char[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        return false;
    }
}

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

