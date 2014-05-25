package me.hch.trigger;

import me.hch.model.Schedule;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zq on 2014/5/25.
 */
public class Selector {
    private static final Pattern ptn = Pattern.compile("\\(([a-zA-Z0-9]+)='([^']+)'\\)");

    private final Map<String, String> kvs = new HashMap<String, String>();

    private Selector() {

    }

    public boolean match(Schedule schedule) {
        // todo: ...
        return false;
    }

    public static Selector getInstance(String query) {
        Matcher matcher = ptn.matcher(query);
        Selector selector = new Selector();
        selector.kvs.clear();
        while (matcher.find()) {
            selector.kvs.put(matcher.group(1), matcher.group(2));
        }
        return selector;
    }

    public static void main(String[] args) {
        String str = "(a='100') and (b='20')";
        Matcher matcher = ptn.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}
