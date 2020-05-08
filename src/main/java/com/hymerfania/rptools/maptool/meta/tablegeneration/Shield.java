package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Shield implements ElementSupplier {
    Buckler("Buckler",1,"Strength","0",1,7,4,false,false,false,true,false),
    Large_Shield("Large Shield",1,"Strength","0",7,13,12,false,false,false,true,false),
    Small_Shield("Small Shield",1,"Strength","0",3,9,11,false,false,false,true,false),
    Fiber_Shield("Fiber Shield",1,"Strength","0",3,9,6,false,false,false,true,false),
    Leather_Shield("Leather Shield",1,"Strength","0",3,7,12,false,false,false,true,false),
    Hide_Shield("Hide Shield",1,"Strength","0",3,9,6,false,false,false,true,false),
;
    private final WeaponExportRow _weaponExportRow;

  Shield(final String name, final int handCount,
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
