package com.hymerfania.rptools.maptool.meta.tablegeneration;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;
import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    protected static int _serial = 0;

    public static void main(String[] args) {
        Element lookupTableElement = new Element("net.rptools.maptool.model.LookupTable");
        Element entryListElement = new Element("entryList");
        Element nameElement = new Element("name");
        Element defaultRollElement = new Element("defaultRoll");
        Element visibleElement = new Element("visible");
        Element allowLookupElement = new Element("allowLookup");
        for (WeaponType weaponType : WeaponType.values()) {
            for (ElementSupplier weapon : weaponType.getElementSuppliers()) {
                entryListElement.appendChild(weapon.getElement());
            }
        }
        nameElement.appendChild("Weapons");
        defaultRollElement.appendChild("1d64");
        visibleElement.appendChild("true");
        allowLookupElement.appendChild("true");

        lookupTableElement.appendChild(entryListElement);
        lookupTableElement.appendChild(nameElement);
        lookupTableElement.appendChild(defaultRollElement);
        lookupTableElement.appendChild(visibleElement);
        lookupTableElement.appendChild(allowLookupElement);

        String output = printXML2String(lookupTableElement);
        System.out.println(output);
    }

    public static String printXML2String(Element xmlElement) {
        final String killMe ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        Document doc = new Document(xmlElement.copy());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String result = "";
        try {
            Serializer serializer = new Serializer(baos, UTF_8.name());
            serializer.setIndent(4);
            serializer.setMaxLength(640);
            serializer.write(doc);
            result = baos.toString(UTF_8.name());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        return result.replace(killMe,"");
    }

    public static String printXML2String(Document doc) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String result = "";
        try {
            Serializer serializer = new Serializer(baos, UTF_8.name());
            serializer.setIndent(4);
            serializer.setMaxLength(640);
            serializer.write(doc);
            result = baos.toString(UTF_8.name());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}