public class Weapon {
    private CombatType combatType;
    private DamageType damageType;

    private String name;

    private int damage;
    private int speed;
    private int strength;
    private int value;

    public Weapon (String name, String combatType, String damageType, int damage, int speed, int strength, int value) {
        this.name = name;

        if (combatType.equalsIgnoreCase("MELEE")) {
            this.combatType = CombatType.MELEE;
        } else if (combatType.equalsIgnoreCase("RANGED")) {
            this.combatType = CombatType.RANGED;
        } else {
            this.combatType = CombatType.NONE;
        }

        if (damageType.equalsIgnoreCase("SLASHING")) {
            this.damageType = DamageType.SLASHING;
        } else if (damageType.equalsIgnoreCase("MISSILE")) {
            this.damageType = DamageType.MISSILE;
        } else if (damageType.equalsIgnoreCase("BLUNT")) {
            this.damageType = DamageType.BLUNT;
        } else if (damageType.equalsIgnoreCase("PIERCING")) {
            this.damageType = DamageType.PIERCING;
        } else {
            this.damageType = DamageType.NONE;
        }

        this.damage=damage;
        this.speed=speed;
        this.strength=strength;
        this.value=value;
    }

    public CombatType getCombatType() {
        return combatType;
    }

    public void setCombatType(CombatType combatType) {
        this.combatType = combatType;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
