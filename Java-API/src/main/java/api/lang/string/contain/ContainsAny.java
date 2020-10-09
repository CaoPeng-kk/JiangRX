package api.lang.string.contain;

/**
 * @Author: caopeng
 * @Description: Java字符串包含字符集中的任何字符
 * @Date: Created in 14:38 2020/10/9
 */
public class ContainsAny {

    public static void main(String[] argv) throws Exception {
        String str = "demo2s.com";
        char[] searchChars = new char[] {'e', 'a'};
        System.out.println(containsAny(str, searchChars));
    }//from   ww  w  .j  a  v a2 s . c o m

    /**
     * <p>Checks if the String contains any character in the given
     * set of characters.</p>
     *
     * <p>A <code>null</code> String will return <code>false</code>.
     * A <code>null</code> or zero length search array will return <code>false</code>.</p>
     *
     * <pre>
     * containsAny(null, *)                = false
     * containsAny("", *)                  = false
     * containsAny(*, null)                = false
     * containsAny(*, [])                  = false
     * containsAny("zzabyycdxx",['z','a']) = true
     * containsAny("zzabyycdxx",['b','y']) = true
     * containsAny("aba", ['z'])           = false
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the <code>true</code> if any of the chars are found,
     * <code>false</code> if no match or null input
     * @since 2.4
     */
    public static boolean containsAny(String str, char[] searchChars) {
        if (str == null || str.length() == 0 || searchChars == null || searchChars.length == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < searchChars.length; j++) {
                if (searchChars[j] == ch) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * <p>
     * Checks if the String contains any character in the given set of characters.
     * </p>
     *
     * <p>
     * A <code>null</code> String will return <code>false</code>. A <code>null</code> search string will return
     * <code>false</code>.
     * </p>
     *
     * <pre>
     * containsAny(null, *)            = false
     * containsAny("", *)              = false
     * containsAny(*, null)            = false
     * containsAny(*, "")              = false
     * containsAny("zzabyycdxx", "za") = true
     * containsAny("zzabyycdxx", "by") = true
     * containsAny("aba","z")          = false
     * </pre>
     *
     * @param str
     *            the String to check, may be null
     * @param searchChars
     *            the chars to search for, may be null
     * @return the <code>true</code> if any of the chars are found, <code>false</code> if no match or null input
     * @since 2.4
     */
    public static boolean containsAny(String str, String searchChars) {
        if (searchChars == null) {
            return false;
        }
        return containsAny(str, searchChars.toCharArray());
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
