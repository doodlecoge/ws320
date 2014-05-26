import java.util.HashMap;
import java.util.Map;

/**
 * Created by huaiwang on 5/26/14.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("a", "b");
        map.put("b", "c");

        map.remove("c");
        map.remove("b");

        for (String s : map.keySet()) {
            System.out.println(s + ":" + map.get(s));
        }

    }
}
