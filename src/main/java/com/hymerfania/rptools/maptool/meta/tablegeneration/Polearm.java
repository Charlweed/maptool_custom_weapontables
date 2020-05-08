package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Polearm implements ElementSupplier{
    Glaive("Glaive",2,"Strength","1d10",7,13,8,false,true,true,false,false),
    Halberd("Halberd",2,"Strength","1d10",7,13,8,true,true,false,false,false),
    Quarterstaff("Quarterstaff",1,"Strength","1d4",9,15,3,true,true,false,false,false),
    Quarterstaff_2H("Quarterstaff 2H",2,"Strength","1d6",5,11,7,true,true,false,false,false),
    Spear("Spear",1,"Strength","1d6",9,15,2,false,false,true,false,false),
    Spear_2H("Spear 2H",2,"Strength","1d8",5,11,8,false,false,false,false,false),
    Trident("Trident",1,"Strength","1d6",9,15,4,false,false,true,false,false),
    Trident_2H("Trident 2H",2,"Strength","1d8",5,11,7,false,false,true,false,false),
;
    private final WeaponExportRow _weaponExportRow;

  Polearm(final String name, final int handCount,
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
