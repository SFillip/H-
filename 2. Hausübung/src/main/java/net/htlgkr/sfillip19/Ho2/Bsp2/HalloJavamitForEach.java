package net.htlgkr.sfillip19.Ho2.Bsp2;

import java.util.ArrayList;
import java.util.Arrays;

public class HalloJavamitForEach {

    private ArrayList<String> StringList;

    public HalloJavamitForEach(String[] strings) {
        StringList=new ArrayList<>();
        StringList.addAll(Arrays.asList(strings));
    }

    public void print() {
        for (String content : StringList) {
            System.out.println(content);
        }

        StringList.forEach((String s) -> System.out.println(s));
    }
}
