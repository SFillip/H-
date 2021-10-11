import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons = populate(args[0]);

        weapons = sortWeapons(weapons);
        weapons = advancedWeaponSort(weapons);
    }

    public static ArrayList<Weapon> populate(String filepath) {
        ArrayList<Weapon> weapons = new ArrayList<>();

        Scanner s = null;
        try {
            s = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            System.out.println("File nicht gefunden");
            System.exit(0);
        }

        s.nextLine();
        while (s.hasNext()) {
            String line = s.nextLine();
            String[] split = line.split(";");

            Weapon tmp = new Weapon(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));

            weapons.add(tmp);
        }
        return weapons;
    }

    public static ArrayList<Weapon> sortWeapons(ArrayList<Weapon> weapons) {
        weapons.sort((Weapon a, Weapon b) -> {
            return b.getDamage() - a.getDamage();
        });
        return weapons;
    }

    public static ArrayList<Weapon> advancedWeaponSort(ArrayList<Weapon> toSort) {
        toSort.sort((Weapon a, Weapon b) -> {
            if (b.getCombatType().compareTo(a.getCombatType()) == 0) {
                if (b.getDamageType().compareTo(a.getDamageType()) == 0) {
                    return b.getName().compareTo(a.getName());
                } else {
                    return b.getDamageType().compareTo(a.getDamageType());
                }
            } else {
                return b.getCombatType().compareTo(a.getCombatType());
            }
        });
        return toSort;
    }
}