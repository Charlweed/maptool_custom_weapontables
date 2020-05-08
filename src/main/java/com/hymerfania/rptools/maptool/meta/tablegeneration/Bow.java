package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Bow implements ElementSupplier{
    Longbow("Longbow",2,"Strength","1d8",11,17,9,false,false,true,false,false),
    Longbow_heavy("Longbow-heavy",1,"Strength","1d4",3,9,3,false,false,true,true,false),
    Longbow_light("Longbow-light",1,"Strength","1d5",5,11,3,false,false,true,false,false),
    Shortbow("Shortbow",2,"Strength","2d6",11,17,9,false,false,true,false,false),
    Shortbow_heavy("Shortbow-heavy",1,"Strength","1d6",7,13,3,false,true,true,false,false),
    Shortbow_light("Shortbow-light",2,"Strength","1d8",5,11,3,false,true,true,false,false),

;
    private final WeaponExportRow _weaponExportRow;

  Bow(final String name, final int handCount,
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
