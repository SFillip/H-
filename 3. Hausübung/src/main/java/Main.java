import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static ArrayList<Weapon> weapons = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = null;
        try {
            s = new Scanner(new File(args[0]));
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
        weapons.sort((Weapon a,Weapon b) -> {return b.getDamage()-a.getDamage();});
    }
}