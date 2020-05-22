package regex;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 21:13 2020/5/21
 */
public class RegexDemo {

    /**
     * 在给定的地址中使用正则表达式提取国家、省份、城市、区、街道、门牌号，见图
     * 中华人民共和国吉林省长春市二道区临河街二道小区4栋二门
     */
    public static void main(String[] args) {
    	System.out.println("地址是：" + addressResolution("宁夏回族自治区银川市灵武市"));
    	System.out.println("地址是：" + addressResolution("中华人民共和国吉林省长春市二道区临河街万兴小区4栋二门"));
    	System.out.println("地址是：" + addressResolution("中华人民共和国黑龙江省牡丹江市西安区牡丹街万兴小区3栋1门"));
    }

    public static List<Map<String,String>> addressResolution(String address){
        String regex = "(?<nation>[^国]+国)(?<province>[^省]+省|[^国]+国|[^自治区]+自治区)(?<city>[^自治州]+自治州|[^市]+市|[^盟]+盟|[^地区]+地区|.+区划)?(?<county>[^市]+市|[^县]+县|[^区]+区|[^旗]+旗|.+区)?(?<town>[^街]+街|.+镇)(?<village>.*)";
        Matcher m = Pattern.compile(regex).matcher(address);
        String nation = null, province = null, city = null, county = null, town = null, village = null;
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> row = null;
        while (m.find()) {
            row = new LinkedHashMap<>();
            nation = m.group("nation");
            row.put("nation",nation == null ? "" :nation.trim());
            province = m.group("province");
            row.put("province", province == null ? "" : province.trim());
            city = m.group("city");
            row.put("city", city == null ? "" : city.trim());
            county = m.group("county");
            row.put("county", county == null ? "" : county.trim());
            town = m.group("town");
            row.put("town", town == null ? "" : town.trim());
            village = m.group("village");
            row.put("village", village == null ? "" : village.trim());
            list.add(row);
        }
        return list;
    }
}

