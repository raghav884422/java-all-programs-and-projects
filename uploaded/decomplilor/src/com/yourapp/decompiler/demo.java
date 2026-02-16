package com.yourapp.decompiler;
import com.strobel.decompiler.Decompiler;
import com.strobel.decompiler.DecompilerSettings;
import com.strobel.decompiler.PlainTextOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -cp .;procyon-decompiler-0.6.0.jar Demo <class-file>");
            return;
        }

        String classFilePath = args[0];
        File file = new File(classFilePath);

        if (!file.exists() || !file.isFile() || !classFilePath.endsWith(".class")) {
            System.out.println("Invalid or missing .class file: " + classFilePath);
            return;
        }

        String outputPath = classFilePath.replace(".class", "_Decompiled.java");

        try (Writer writer = new FileWriter(outputPath)) {
            DecompilerSettings settings = DecompilerSettings.javaDefaults();
            Decompiler.decompile(classFilePath, new PlainTextOutput(writer), settings);
            System.out.println("✅ Decompiled source saved to: " + outputPath);
        } catch (IOException e) {
            System.err.println("❌ Error during decompilation: " + e.getMessage());
        }
    }
}
