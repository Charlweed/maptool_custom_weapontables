package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Thrown implements ElementSupplier{
    Dart("Dart",1,"Dexterity","1d4",1,6,1,false,false,false,false,false),
    Javelin("Javelin",1,"Strength","1d6",3,9,2,false,false,true,false,false),
    Net("Net",2,"Dexterity","0",1,7,2,false,false,false,false,false),
    Sling("Sling",1,"Dexterity","1d4",1,7,1,false,false,false,false,false),
    Shirkin("Shirkin",1,"Dexterity","1d4",1,6,1,false,false,true,false,false),
    Rock("Rock",1,"Dexterity","1d4",2,6,1,true,false,false,false,false),
    Dart_Poison("Dart-Poison",1,"Dexterity","1d6",1,6,1,false,false,true,false,true),
;
    private final WeaponExportRow _weaponExportRow;

  Thrown(final String name, final int handCount,
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
