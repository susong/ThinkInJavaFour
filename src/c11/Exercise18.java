package c11;

import java.util.*;

/**
 * Created by SuSong on 2015-01-12 22:53.
 */
public class Exercise18 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<10;i++){
            map.put(new Random().nextInt(100)+"",i+"");
        }

        System.out.println(map);

        String[] strings = map.keySet().toArray(new String[1]);
        Arrays.sort(strings);

        Map<String ,String> map2 = new LinkedHashMap<>();
        for(String s:strings){
            map2.put(s,map.get(s));
        }

        System.out.println(map2);
    }
}
