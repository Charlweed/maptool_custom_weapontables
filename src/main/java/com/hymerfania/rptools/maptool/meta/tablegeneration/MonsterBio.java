package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum MonsterBio implements ElementSupplier {
    Spit_large("Spit-large",1,"","Dexterity",1,5,1,false,false,false,false,true),
    Spit_med("Spit-med",1,"","Dexterity",1,5,1,false,false,false,false,true),
    Sting_giant("Sting-giant",1,"","Dexterity",1,5,3,false,false,true,false,true),
    Sting_large("Sting-large",1,"","Dexterity",1,5,4,false,false,true,false,true),
    Sting_med("Sting-med",1,"","Dexterity",1,5,5,false,false,true,false,true),
    Sting_small("Sting-small",1,"","Dexterity",1,5,1,false,false,true,false,true),
    Cloud_aerosol("Cloud-aerosol",1,"","Dexterity",1,5,1,false,false,false,false,true),
    Cloud_gas("Cloud-gas",1,"","Dexterity",1,5,1,false,false,false,false,true),
;
    private final WeaponExportRow _weaponExportRow;

  MonsterBio(final String name, final int handCount,
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
