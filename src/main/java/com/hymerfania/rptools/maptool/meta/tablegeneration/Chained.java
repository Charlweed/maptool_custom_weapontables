package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Chained implements ElementSupplier{
    Flail("Flail",1,"Strength","1d6",7,13,5,true,false,false,false,false),
    Morningstar("Morningstar",1,"Strength","1d8",7,13,5,true,true,false,false,false),
    Nun_Chucks("Nun-Chucks",1,"Strength","1d6",6,13,5,true,true,false,false,false),
;
    private final WeaponExportRow _weaponExportRow;

  Chained(final String name, final int handCount,
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
