package net.htlgkr.sfillip19.Ho2.Bsp2;

import java.awt.datatransfer.StringSelection;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HalloJavamitForEach {

    private ArrayList<String> StringList;

    public HalloJavamitForEach(String[] strings) {
        StringList = Array.asList(strings);
    }

    public void print() {
        for (String content : StringLis) {
            System.out.println(content);
        }

        StringList.forEach((String s) -> System.out.println(s));
    }
}
