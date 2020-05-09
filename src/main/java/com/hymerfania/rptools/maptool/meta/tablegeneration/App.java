package com.hymerfania.rptools.maptool.meta.tablegeneration;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;
import static java.nio.charset.StandardCharsets.UTF_8;

public class App {
    /* Start Serial number s with One (1), not Zero */
    protected static int _serial = 1;

    public static final String CONTENT_XML_FILENAME = "r:/content.xml";

    public static void main(String[] args) throws InterruptedException, IOException {
        Path tableXMLTextFile = Paths.get(CONTENT_XML_FILENAME);

        Files.deleteIfExists(tableXMLTextFile);
        Thread.sleep(500L);

        if (Files.exists(tableXMLTextFile)) {
            throw new IOException("Could not delete " + tableXMLTextFile.toAbsolutePath());
        }
        System.out.println("Table XML to " + tableXMLTextFile.toAbsolutePath());


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
        nameElement.appendChild("Weapons01");
        defaultRollElement.appendChild("1d85");
        visibleElement.appendChild("true");
        allowLookupElement.appendChild("true");

        lookupTableElement.appendChild(entryListElement);
        lookupTableElement.appendChild(nameElement);
        lookupTableElement.appendChild(defaultRollElement);
        lookupTableElement.appendChild(visibleElement);
        lookupTableElement.appendChild(allowLookupElement);

        String output = printXML2String(lookupTableElement);
        writeStringToFile(output.trim(), tableXMLTextFile.toString());
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

    public static void writeStringToFile(final String strIn, final String fileName) throws IOException, InterruptedException {
        Path tableXMLTextFile = Paths.get(fileName);
        Files.deleteIfExists(tableXMLTextFile);
        Thread.sleep(500L);
        /* This is a bug in MapTool, proper XML does not need the quotes escaped. */
        final String str = strIn.replace("\"","&quot;");
        if (Files.exists(tableXMLTextFile)) {
            throw new IOException("Could not delete " + tableXMLTextFile.toAbsolutePath());
        }
        System.out.println("Writing Table XML to " + tableXMLTextFile.toAbsolutePath());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(str);
        }
        catch (IOException thrown) {
            thrown.printStackTrace();
        }
    }
}