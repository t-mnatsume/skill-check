package q002;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Q002 {
    /**
     * データ一覧
     */
    private static final String[] dataList = {
            "8,佐藤",
            "10,鈴木",
            "11,高橋",
            "12,田中",
            "20,渡辺",
            "1,伊藤",
            "18,山本",
            "13,中村",
            "5,小林",
            "3,加藤",
            "19,吉田",
            "17,山田",
            "7,佐々木",
            "16,山口",
            "6,斉藤",
            "15,松本",
            "2,井上",
            "4,木村",
            "14,林",
            "9,清水"
    };
    public static void main (String args[]) {
        List<String> list = Arrays.asList(dataList);
        Map<Integer, String> map = new HashMap<>();

        for(String str : list) {
            String[] data = str.split(",");
            map.put(Integer.parseInt(data[0]), data[1]);
        }

        Map<Integer, String> treeMap = new TreeMap<Integer, String>(map);
        for (Integer key : treeMap.keySet()) {
            System.out.println(key + "," + treeMap.get(key));
        }
    }
}
// 完成までの時間: 3時間 00分