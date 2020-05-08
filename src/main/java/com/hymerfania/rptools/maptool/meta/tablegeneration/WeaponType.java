package com.hymerfania.rptools.maptool.meta.tablegeneration;

public enum WeaponType {
    AXE(Axe.class),
    BASH(Bash.class),
    BOW(Bow.class),
    CHAINED(Chained.class),
    CROSSBOW(Crossbow.class),
    FINESSE(Finesse.class),
    LIGHT(Light.class),
    MONSTER_BIO(MonsterBio.class),
    MONSTER_MELEE(MonsterMelee.class),
    POLEARM(Polearm.class),
    SHIELD(Shield.class),
    SWORD(Sword.class),
    THROWN(Thrown.class),//
    ;

    private final Class<? extends Enum<?>> _rowSupplierClazz;

    WeaponType(final Class<? extends Enum<?>> rowSupplierClazz) {
        _rowSupplierClazz = rowSupplierClazz;
    }

    public Enum<?>[] getEnums(){
        return _rowSupplierClazz.getEnumConstants();
    }

    public ElementSupplier[] getElementSuppliers(){
        return ( ElementSupplier[])_rowSupplierClazz.getEnumConstants();
    }
}
