package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Crossbow implements ElementSupplier{
    Crossbow_hand("Crossbow-hand",1,"Dexterity","1d5",3,9,2,false,false,true,false,false),
    Crossbow_heavy("Crossbow-heavy",2,"Dexterity","1d10",9,15,2,false,false,true,false,false),
    Crossbow_light("Crossbow-light",2,"Dexterity","1d8",5,11,2,false,false,true,false,false),
    Crossbow_alchemical("Crossbow-alchemical",2,"Dexterity","3d6",8,9,2,false,false,true,false,false),
;
    private final WeaponExportRow _weaponExportRow;

  Crossbow(final String name, final int handCount,
           final String toHitStat, final String damage, final int parryId,
           final int minStr, final int minStrStam, final boolean crush, final boolean swing,
           final boolean pierce, final boolean offhand,
           final boolean bio){
      _weaponExportRow = makeWeaponExportRow(name,getClass().getSimpleName(), handCount, toHitStat, damage, parryId, minStr, minStrStam, crush, swing, pierce, offhand, bio);
  }
    @Override
    public WeaponExportRow getWeaponExportRow(){
        return _weaponExportRow;
    }
}
