package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Sword implements ElementSupplier{
    Greatsword("Greatsword",2,"Strength","2d6",11,17,10,true,true,false,false,false),
    Katana_heavy("Katana-heavy",1,"Strength","1d8",9,15,6,false,true,true,false,false),
    Katana_heavy_2H("Katana-heavy 2H",2,"Strength","1d10",7,13,7,false,true,true,false,false),
    Longsword("Longsword",1,"Strength","1d8",9,15,6,false,true,true,false,false),
    Longsword_2H("Longsword 2H",2,"Strength","1d10",7,13,7,false,true,true,false,false),
;
    private final WeaponExportRow _weaponExportRow;

  Sword(final String name, final int handCount,
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
