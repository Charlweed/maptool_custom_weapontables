package com.hymerfania.rptools.maptool.meta.tablegeneration;

import java.util.Objects;
import nu.xom.Element;

public interface ElementSupplier {

    default Element getElement(){
        return getWeaponExportRow().toElement(App._serial++);
    }

    WeaponExportRow getWeaponExportRow();
}
