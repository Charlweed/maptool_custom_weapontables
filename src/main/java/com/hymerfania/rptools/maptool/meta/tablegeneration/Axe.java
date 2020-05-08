package com.hymerfania.rptools.maptool.meta.tablegeneration;

import java.util.List;
import nu.xom.Element;
import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum Axe implements ElementSupplier{
    Battleaxe("Battleaxe",1,"Strength","1d8",9,15,9,true,true,false,false,false),
    Battleaxe_2H("Battleaxe 2H",2,"Strength","1d10",7,13,9,false,false,false,false,false),
    Greataxe("Greataxe",2,"Strength","1d12",11,17,9,true,true,false,false,false),
    Handaxe("Handaxe",1,"Strength","1d6",3,9,3,false,false,false,true,false),
;
    private final WeaponExportRow _weaponExportRow;

  Axe(final String name, final int handCount,
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
