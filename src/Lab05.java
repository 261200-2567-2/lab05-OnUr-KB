public class Lab05 {

    public static void main(String[] args) {
        // Create instances of characters
        character.Warrior warrior = new character().new WarriorImpl(5, 10); // Level 5, Speed 10
        character.Healer healer = new character().new HealerImpl(4, 12);   // Level 4, Speed 12
        character.Mage mage = new character().new MageImpl(6, 8);         // Level 6, Speed 8

        // Create instances of accessories
        character.Armor armor = new character().new ArmorImpl(50.0, 3);      // Armor with base defense 50, Level 3
        character.Shield shield = new character().new ShieldImpl(30.0, 2);   // Shield with base defense 30, Level 2
        character.Sword sword = new character().new SwordImpl(40.0, 4);      // Sword with base damage 40, Level 4
        character.Amulet amulet = new character().new AmuletImpl(20.0, 5);    // Amulet with base defense 20, Level 5

        // Warrior Methods with Accessories
        System.out.println("Warrior Actions with Accessories:");
        System.out.println("Warrior Level: " + warrior.getLevel());
        System.out.println("Warrior HP: " + warrior.getHp());
        System.out.println("Warrior Strength: " + warrior.getStrength());
        System.out.println("Warrior Armor Base Defense: " + armor.getArmorBaseDefense());
        System.out.println("Warrior Shield Base Defense: " + shield.getShieldBaseDefense());
        System.out.println("Warrior Sword Base Damage: " + sword.getSwordBaseDamage());
        System.out.println("Warrior Amulet Base Defense: " + amulet.getAmuletBaseDefense());
        System.out.println("Warrior Armor Defense: " + armor.getArmorDefense());
        System.out.println("Warrior Shield Defense: " + shield.getShieldDefense());
        System.out.println("Warrior Sword Damage: " + sword.getSwordDamage());
        System.out.println("Warrior Run Speed Decrease due to Armor: " + armor.getRunSpeedDecrease(warrior.getSpeed()));
        System.out.println("Warrior Run Speed Decrease due to Shield: " + shield.getRunSpeedDecrease(warrior.getSpeed()));
        System.out.println("Warrior Run Speed Decrease due to Sword: " + sword.getRunSpeedDecrease(warrior.getSpeed()));

        warrior.useStrength(10);
        System.out.println("Warrior used 10 Strength. Remaining Strength: " + warrior.getStrength());
        warrior.recoverStrength(20);
        System.out.println("Warrior recovered 20 Strength. Current Strength: " + warrior.getStrength());
        warrior.recoverHp(50);
        System.out.println("Warrior recovered 50 HP. Current HP: " + warrior.getHp());

        // Healer Methods with Accessories
        System.out.println("\nHealer Actions with Accessories:");
        System.out.println("Healer Level: " + healer.getLevel());
        System.out.println("Healer HP: " + healer.getHp());
        System.out.println("Healer Mana: " + healer.getMana());
        System.out.println("Healer Armor Base Defense: " + armor.getArmorBaseDefense());
        System.out.println("Healer Amulet Base Defense: " + amulet.getAmuletBaseDefense());
        System.out.println("Healer Armor Defense: " + armor.getArmorDefense());
        System.out.println("Healer Amulet Defense: " + amulet.getAmuletDefense());
        System.out.println("Healer Run Speed Decrease due to Armor: " + armor.getRunSpeedDecrease(healer.getSpeed()));
        System.out.println("Healer Run Speed Decrease due to Amulet: " + amulet.getRunSpeedDecrease(healer.getSpeed()));

        healer.useMana(15);
        System.out.println("Healer used 15 Mana. Remaining Mana: " + healer.getMana());
        healer.recoverMana(25);
        System.out.println("Healer recovered 25 Mana. Current Mana: " + healer.getMana());
        healer.recoverHp(30);
        System.out.println("Healer recovered 30 HP. Current HP: " + healer.getHp());

        // Mage Methods with Accessories
        System.out.println("\nMage Actions with Accessories:");
        System.out.println("Mage Level: " + mage.getLevel());
        System.out.println("Mage HP: " + mage.getHp());
        System.out.println("Mage Magic: " + mage.getMagic());
        System.out.println("Mage Sword Base Damage: " + sword.getSwordBaseDamage());
        System.out.println("Mage Amulet Base Defense: " + amulet.getAmuletBaseDefense());
        System.out.println("Mage Sword Damage: " + sword.getSwordDamage());
        System.out.println("Mage Amulet Defense: " + amulet.getAmuletDefense());
        System.out.println("Mage Run Speed Decrease due to Sword: " + sword.getRunSpeedDecrease(mage.getSpeed()));
        System.out.println("Mage Run Speed Decrease due to Amulet: " + amulet.getRunSpeedDecrease(mage.getSpeed()));

        mage.useMagic(20);
        System.out.println("Mage used 20 Magic. Remaining Magic: " + mage.getMagic());
        mage.recoverMagic(15);
        System.out.println("Mage recovered 15 Magic. Current Magic: " + mage.getMagic());
        mage.recoverHp(40);
        System.out.println("Mage recovered 40 HP. Current HP: " + mage.getHp());

        // Interaction Example with Accessories
        System.out.println("\nInteraction Example with Accessories:");
        healer.recoverHp(20);
        System.out.println("Healer healed Warrior for 20 HP. Warrior's HP: " + warrior.getHp());
        mage.useMagic(30);
        System.out.println("Mage casts a spell using 30 Magic. Remaining Magic: " + mage.getMagic());
        warrior.useStrength(25);
        System.out.println("Warrior attacks using 25 Strength. Remaining Strength: " + warrior.getStrength());
    }
}
