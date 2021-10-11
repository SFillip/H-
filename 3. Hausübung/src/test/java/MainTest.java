import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void sortWeapons() {
        ArrayList<Weapon> tmp=new ArrayList<Weapon>();
        ArrayList<Weapon> result=new ArrayList<>();

        tmp.add(new Weapon("m4a1","ranged","missile",250,0,0,0));
        tmp.add(new Weapon("ak47","ranged","missile",400,0,0,0));
        tmp.add(new Weapon("negev","ranged","missile",120,0,0,0));

        result.add(new Weapon("negev","ranged","missile",120,0,0,0));
        result.add(new Weapon("m4a1","ranged","missile",250,0,0,0));
        result.add(new Weapon("ak47","ranged","missile",400,0,0,0));

        tmp=Main.sortWeapons(tmp);

        assertEquals(tmp,result);
    }
}