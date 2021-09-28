package net.htlgkr.sfillip19.Ho2.Bsp3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester {

    private NumberTest oddTester;
    private NumberTest printTester;
    private NumberTest paindroneTester;

    private int rowCount;
    private String[]rows;

    public NumberTester(String fileName) {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Datei existiert nicht");
            System.exit(0);
        }

        rowCount = Integer.parseInt(scanner.next());

        rows=new String[rowCount];

        for(int i=0;i<rowCount;i++){
            rows[i]=scanner.next();
        }
    }

    public void setOddTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrintTester(NumberTest printTester) {
        this.printTester = printTester;
    }

    public void setPaindroneTester(NumberTest paindroneTester) {
        this.paindroneTester = paindroneTester;
    }

    public void TestFile() {

    }
}
