import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons = populate(args[0]);

        weapons = sortWeapons(weapons);
        weapons = advancedWeaponSort(weapons);

        Printable standartPrinter = (List<Weapon> wp) -> {
            for (Weapon weapon : wp) {
                System.out.println(weapon.toString());
            }
        };

        Printable tablePrinter = (List<Weapon> wp) -> {
            for (Weapon weapon : wp) {
                System.out.println(String.format("|%20s|",weapon.getName())+ String.format("%20s|",weapon.getCombatType().toString())+ String.format("%20s|",weapon.getDamageType().toString())+ String.format("%20d|", weapon.getDamage())+ String.format("%20d|", weapon.getSpeed())+ String.format("%20d|",weapon.getStrength())+String.format("%20d|",weapon.getValue()));
            }
        };

        standartPrinter.print(weapons);
        System.out.println();
        tablePrinter.print(weapons);
    }

    public static ArrayList<Weapon> populate(String filepath) {
        ArrayList<Weapon> weapons = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(filepath))) {
            stream.forEach((String line) -> {
                String[] split = line.split(";");

                if(!split[0].equalsIgnoreCase("name")){
                    Weapon tmp = new Weapon(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));

                    weapons.add(tmp);
                }
            });
        } catch (IOException exception) {
            exception.printStackTrace();
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