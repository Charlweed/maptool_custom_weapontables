package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Finesse implements ElementSupplier{
    Dagger("Dagger",1,"Strength","1d4",1,7,2,false,false,false,true,false),
    Dagger_Parrying("Dagger-Parrying",1,"Strength","1d4",1,7,4,false,false,true,true,false),
    Katana_light("Katana-light",1,"Strength","1d8",7,13,6,false,true,true,false,false),
    Rapier("Rapier",1,"Strength","1d8",3,9,4,false,false,true,false,false),
    Scimitar("Scimitar",1,"Strength","1d6",7,13,4,false,true,false,false,false),
    Shortsword("Shortsword",1,"Strength","1d6",5,11,4,false,true,true,true,false),
    Whip("Whip",1,"Strength","1d4",3,9,5,false,false,false,false,false),
;
    private final WeaponExportRow _weaponExportRow;

  Finesse(final String name, final int handCount,
          final String toHitStat, final String damage, final int parryId,
          final int minStr, final int minStrStam, final boolean crush, final boolean swing,
          final boolean pierce, final boolean offhand,
          final boolean bio){
      _weaponExportRow = makeWeaponExportRow(name,getClass().getSimpleName(), handCount, toHitStat, damage, parryId, minStr, minStrStam, crush, swing, pierce, offhand, bio);
  }
// =SUBSTITUTE(E2,"-","_")
@Override
public WeaponExportRow getWeaponExportRow(){
    return _weaponExportRow;
}
}
