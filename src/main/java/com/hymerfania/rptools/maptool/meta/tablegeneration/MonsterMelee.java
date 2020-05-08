package com.hymerfania.rptools.maptool.meta.tablegeneration;

import static com.hymerfania.rptools.maptool.meta.tablegeneration.WeaponExportRow.makeWeaponExportRow;

public enum MonsterMelee implements ElementSupplier{
    Bash_giant("Bash-giant",1,"Strength","1d2",1,1,2,true,false,false,true,false),
    Bash_large("Bash-large",1,"Strength","1d4",1,1,3,true,false,false,true,false),
    Bash_med("Bash-med",1,"Strength","1d8",1,1,9,true,false,false,true,false),
    Bash_small("Bash-small",1,"Strength","2d8",1,1,9,true,false,false,true,false),
    Bite_giant("Bite-giant",1,"Dexterity","1d2",1,1,1,false,false,false,true,false),
    Bite_large("Bite-large",1,"Dexterity","1d4",1,1,1,false,false,false,true,false),
    Bite_med("Bite-med",1,"Dexterity","1d10",1,1,1,false,false,false,true,false),
    Bite_small("Bite-small",1,"Dexterity","2d10",1,1,1,false,false,false,true,false),
    Claw_giant("Claw-giant",1,"Strength","1d4",1,1,2,false,true,false,true,false),
    Claw_large("Claw-large",1,"Strength","1d6",1,1,4,false,true,false,true,false),
    Claw_med("Claw-med",1,"Strength","2d6",1,1,6,false,true,false,true,false),
    Claw_small("Claw-small",1,"Strength","3d6",1,1,10,false,true,false,true,false),
;
    private final WeaponExportRow _weaponExportRow;

  MonsterMelee(final String name, final int handCount,
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
