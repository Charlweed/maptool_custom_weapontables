package com.hymerfania.rptools.maptool.meta.tablegeneration;

import java.util.Objects;
import java.util.UUID;
import nu.xom.Element;

public class WeaponExportRow {
    public static long MSB = 8478169612886935310L;
    public static WeaponExportRow makeWeaponExportRow(
            final String name, final String type, final int handCount,
            final String toHitStat, final String damage, final int parryId,
            final int minStr, final int minStrStam, final boolean crush, final boolean swing,
            final boolean pierce, final boolean offhand,
            final boolean bio
    ) {
        return new WeaponExportRow(name, type, handCount, toHitStat, damage, parryId, minStr, minStrStam, crush,
                swing, pierce, offhand, bio);
    }

    private final String _guid;
    private final String _name;
    private final String _type;
    private final int _handCount;
    private final String _toHitStat;
    private final String _damage;
    private final int _parryId;
    private final int _minStr;
    private final int _minStrStam;
    private final boolean _crush;
    private final boolean _swing;
    private final boolean _pierce;
    private final boolean _offhand;
    private final boolean _bio;

    private WeaponExportRow(final String name, final String type, final int handCount,
                            final String toHitStat, final String damage, final int parryId,
                            final int minStr, final int minStrStam, final boolean crush, final boolean swing,
                            final boolean pierce, final boolean offhand,
                            final boolean bio) {
        _name = name;
        _type = type;
        _handCount = handCount;
        _toHitStat = toHitStat;
        _damage = damage;
        _parryId = parryId;
        _minStr = minStr;
        _minStrStam = minStrStam;
        _crush = crush;
        _swing = swing;
        _pierce = pierce;
        _offhand = offhand;
        _bio = bio;
        long lsb = Objects.hash(
                name,
                type,
                handCount,
                toHitStat,
                damage,
                parryId,
                minStr,
                minStrStam,
                crush,
                swing,
                pierce,
                offhand,
                bio);
       _guid = new UUID(MSB,lsb).toString();
    }

    public String getGuid() {
        return _guid;
    }

    public String getName() {
        return _name;
    }

    public String getType() {
        return _type;
    }

    public int getHandCount() {
        return _handCount;
    }

    public String getToHitStat() {
        return _toHitStat;
    }

    public String getDamage() {
        return _damage;
    }

    public int getParryId() {
        return _parryId;
    }

    public int getMinStr() {
        return _minStr;
    }

    public int getMinStrStam() {
        return _minStrStam;
    }

    public boolean isCrush() {
        return _crush;
    }

    public boolean isSwing() {
        return _swing;
    }

    public boolean isPierce() {
        return _pierce;
    }

    public boolean isOffhand() {
        return _offhand;
    }

    public boolean isBio() {
        return _bio;
    }

    public Element toElement(int serial) {
        Element lookupEntryElement = new Element("net.rptools.maptool.model.LookupTable_-LookupEntry");
        Element minElement = new Element("min");
        Element maxElement = new Element("max");
        Element valueElement = new Element("value");

        minElement.appendChild(Integer.toString(serial));
        maxElement.appendChild(Integer.toString(serial));
        valueElement.appendChild(toString());

        lookupEntryElement.appendChild(minElement);
        lookupEntryElement.appendChild(maxElement);
        lookupEntryElement.appendChild(valueElement);
        return lookupEntryElement;
    }

    @Override
    public String toString() {
        return "WeaponExportRow{" +
                "name=\"" + _name + "\"," +
                "type=\"" + _type + "\"," +
                "handCount=\"" + _handCount + "\"," +
                "toHitStat=\"" + _toHitStat + "\"," +
                "damage=\"" + _damage + "\"," +
                "parryId=\"" + _parryId + "\"," +
                "minStr=\"" + _minStr + "\"," +
                "_minStrStam=\"" + _minStrStam + "\"," +
                "crush=\"" + _crush + "\"," +
                "swing=\"" + _swing + "\"," +
                "pierce=\"" + _pierce + "\"," +
                "offhand=\"" + _offhand + "\"," +
                "bio=\"" + _bio + "\"," +
                "guid=\"" + _guid + "\"" +
                '}';
    }
}
