package net.htlgkr.sfillip19.Ho2;

import net.htlgkr.sfillip19.Ho2.Bsp2.HalloJavamitForEach;
import net.htlgkr.sfillip19.Ho2.Bsp3.NumberTester;

public class Main {

    static final String TESTFILEPATH="C:\\Users\\sturm\\Documents\\Schule\\Pos\\HÜ\\2. Hausübung\\TestNumbers.txt";

    public static void main(String[] args) {
        System.out.println("BSP 2");
        HalloJavamitForEach halloJavamitForEach=new HalloJavamitForEach(args);
        halloJavamitForEach.print();
        System.out.println("");

        System.out.println("Bsp 3");
        NumberTester numberTester=new NumberTester(TESTFILEPATH);
        numberTester.TestFile();
        System.out.println("");
    }
}