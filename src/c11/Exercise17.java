package c11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by SuSong on 2015-01-12 22:45.
 */
public class Exercise17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Fuzzy", new Gerbil(1));
        gerbilMap.put("Spot", new Gerbil(2));
        Iterator<Map.Entry<String, Gerbil>> it = gerbilMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Gerbil> next = it.next();
            System.out.println(next.getKey());
            next.getValue().hop();
        }
    }
}
