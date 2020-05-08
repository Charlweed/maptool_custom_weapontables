package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Bash implements ElementSupplier{
    Greatclub("Greatclub",2,"Strength","1d8",11,17,9,true,false,false,false,false),
    Hammer_light("Hammer-light",1,"Strength","1d4",3,9,3,true,false,false,true,false),
    Mace("Mace",1,"Strength","1d5",5,11,3,true,false,false,false,false),
    Maul("Maul",2,"Strength","2d6",11,17,9,true,false,false,false,false),
    Warhammer("Warhammer",1,"Strength","1d6",7,13,3,true,true,false,false,false),
    Warhammer_2H("Warhammer 2H",2,"Strength","1d8",5,11,3,true,true,false,false,false),
    Billyclub("Billyclub",1,"Strength","1d4",4,9,3,true,true,false,false,false),
    Rod("Rod",1,"Strength","1d6",5,9,3,true,true,false,false,false),
;
    private final WeaponExportRow _weaponExportRow;

  Bash(final String name, final int handCount,
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
