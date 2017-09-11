package javautil;

import org.junit.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by fayne on 2017/8/30
 */
public class MapTest {

    @Test
    public void hashMapTest() throws Exception {
        TreeMap<String,String> dateMap = new TreeMap<>();

        dateMap.put("2017-06-02","2017-06-02");
        dateMap.put("2017-07-01","2017-07-01");
        dateMap.put("2017-07-02","2017-07-02");
        dateMap.put("2017-06-04","2017-06-04");

        Set<Map.Entry<String,String>> elements = dateMap.entrySet();
        for (Map.Entry<String,String> element : elements){
            System.out.println(element.getKey());
        }
    }
}
