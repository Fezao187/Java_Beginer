// Looking At a Basic Bulk Data Operation
public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String spellName, SpellType spellType,
                 String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    public String toString() {
        return name;
    }

}