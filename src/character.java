public class character {
    // Base interface for shared character properties
    public interface Character {
        int getHp();
        void recoverHp(int amount);
        int getLevel();
        int getSpeed();
    }

    // Warrior interface
    public interface Warrior extends Character {
        int getStrength();
        void useStrength(int amount);
        void recoverStrength(int amount);
    }

    // Healer interface
    public interface Healer extends Character {
        int getMana();
        void useMana(int amount);
        void recoverMana(int amount);
    }

    // Mage interface
    public interface Mage extends Character {
        int getMagic();
        void useMagic(int amount);
        void recoverMagic(int amount);
    }

    // Warrior implementation
    public class WarriorImpl implements Warrior {
        private int hp;
        private int strength;
        private int level;
        private int speed;

        public WarriorImpl(int level, int speed) {
            this.level = level;
            this.hp = getMaxHp();
            this.strength = getMaxStrength();
            this.speed = speed;
        }

        @Override
        public int getHp() {
            return hp;
        }

        @Override
        public void recoverHp(int amount) {
            hp = Math.min(hp + amount, getMaxHp());
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public int getStrength() {
            return strength;
        }

        @Override
        public void useStrength(int amount) {
            if (strength >= amount) {
                strength -= amount;
            } else {
                throw new IllegalArgumentException("Not enough strength!");
            }
        }

        @Override
        public void recoverStrength(int amount) {
            strength = Math.min(strength + amount, getMaxStrength());
        }

        private int getMaxHp() {
            return 100 + 10 * level;
        }

        private int getMaxStrength() {
            return 50 + 2 * level;
        }
    }

    // Healer implementation
    public class HealerImpl implements Healer {
        private int hp;
        private int mana;
        private int level;
        private int speed;

        public HealerImpl(int level, int speed) {
            this.level = level;
            this.hp = getMaxHp();
            this.mana = getMaxMana();
            this.speed = speed;
        }

        @Override
        public int getHp() {
            return hp;
        }

        @Override
        public void recoverHp(int amount) {
            hp = Math.min(hp + amount, getMaxHp());
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public int getMana() {
            return mana;
        }

        @Override
        public void useMana(int amount) {
            if (mana >= amount) {
                mana -= amount;
            } else {
                throw new IllegalArgumentException("Not enough mana!");
            }
        }

        @Override
        public void recoverMana(int amount) {
            mana = Math.min(mana + amount, getMaxMana());
        }

        private int getMaxHp() {
            return 100 + 10 * level;
        }

        private int getMaxMana() {
            return 50 + 2 * level;
        }
    }

    // Mage implementation
    public class MageImpl implements Mage {
        private int hp;
        private int magic;
        private int level;
        private int speed;

        public MageImpl(int level, int speed) {
            this.level = level;
            this.hp = getMaxHp();
            this.magic = getMaxMagic();
            this.speed = speed;
        }

        @Override
        public int getHp() {
            return hp;
        }

        @Override
        public void recoverHp(int amount) {
            hp = Math.min(hp + amount, getMaxHp());
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public int getSpeed() {
            return speed;
        }

        @Override
        public int getMagic() {
            return magic;
        }

        @Override
        public void useMagic(int amount) {
            if (magic >= amount) {
                magic -= amount;
            } else {
                throw new IllegalArgumentException("Not enough magic!");
            }
        }

        @Override
        public void recoverMagic(int amount) {
            magic = Math.min(magic + amount, getMaxMagic());
        }

        private int getMaxHp() {
            return 100 + 10 * level;
        }

        private int getMaxMagic() {
            return 50 + 2 * level;
        }
    }
    // Base interface for accessories
    public interface Accessory {
        int getLevel();
        double getRunSpeedDecrease(double baseRunSpeed);
    }

    // Armor interface
    public interface Armor extends Accessory {
        double getArmorBaseDefense();
        double getArmorDefense();
    }

    // Shield interface
    public interface Shield extends Accessory {
        double getShieldBaseDefense();
        double getShieldDefense();
    }

    // Sword interface
    public interface Sword extends Accessory {
        double getSwordBaseDamage();
        double getSwordDamage();
    }

    // Amulet interface
    public interface Amulet extends Accessory {
        double getAmuletBaseDefense();
        double getAmuletDefense();
    }

    public class ArmorImpl implements Armor {
        private double baseDefense;
        private int level;

        public ArmorImpl(double baseDefense, int level) {
            this.baseDefense = baseDefense;
            this.level = level;
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public double getArmorBaseDefense() {
            return baseDefense;
        }

        @Override
        public double getArmorDefense() {
            return baseDefense * (1 + 0.05 * level);
        }

        @Override
        public double getRunSpeedDecrease(double baseRunSpeed) {
            return baseRunSpeed * (0.1 + 0.10 * level);
        }
    }

    public class ShieldImpl implements Shield {
        private double baseDefense;
        private int level;

        public ShieldImpl(double baseDefense, int level) {
            this.baseDefense = baseDefense;
            this.level = level;
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public double getShieldBaseDefense() {
            return baseDefense;
        }

        @Override
        public double getShieldDefense() {
            return baseDefense * (1 + 0.1 * level);
        }

        @Override
        public double getRunSpeedDecrease(double baseRunSpeed) {
            return baseRunSpeed * (0.1 + 0.08 * level);
        }
    }

    public class SwordImpl implements Sword {
        private double baseDamage;
        private int level;

        public SwordImpl(double baseDamage, int level) {
            this.baseDamage = baseDamage;
            this.level = level;
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public double getSwordBaseDamage() {
            return baseDamage;
        }

        @Override
        public double getSwordDamage() {
            return baseDamage * (1 + 0.2 * level);
        }

        @Override
        public double getRunSpeedDecrease(double baseRunSpeed) {
            return baseRunSpeed * (0.1 + 0.04 * level);
        }
    }

    public class AmuletImpl implements Amulet {
        private double baseDefense;
        private int level;

        public AmuletImpl(double baseDefense, int level) {
            this.baseDefense = baseDefense;
            this.level = level;
        }

        @Override
        public int getLevel() {
            return level;
        }

        @Override
        public double getAmuletBaseDefense() {
            return baseDefense;
        }

        @Override
        public double getAmuletDefense() {
            return baseDefense * (1 + 0.1 * level);
        }

        @Override
        public double getRunSpeedDecrease(double baseRunSpeed) {
            return baseRunSpeed * (0.1 + 0.01 * level);
        }
    }

}
