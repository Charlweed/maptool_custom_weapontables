package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Light implements ElementSupplier {
    Blowgun("Blowgun",1,"Dexterity","1",1,1,1,false,false,false,false,true),
    Club("Club",1,"Strength","1d4",3,9,3,true,false,false,true,false),
    Fist("Fist",1,"Strength","0",1,1,2,false,false,false,true,false),
    Sickle("Sickle",1,"Strength","1d4",1,7,2,false,false,false,true,false),
    Torch("Torch",1,"Strength","0",1,1,2,false,false,false,true,false),
    Lantern("Lantern",1,"Strength","0",1,1,2,false,false,false,true,false),
    Other("Other",1,"Strength","0",1,1,2,false,false,false,true,false),
;
    private final WeaponExportRow _weaponExportRow;

  Light(final String name, final int handCount,
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
