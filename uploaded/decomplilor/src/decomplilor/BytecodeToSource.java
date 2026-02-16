package decomplilor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BytecodeToSource extends JFrame {
    JButton chooseButton;
    JTextArea sourceArea;

    public BytecodeToSource() {
        setTitle("Bytecode to Source Code Converter");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        chooseButton = new JButton("Select .class File");
        sourceArea = new JTextArea();
        sourceArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scroll = new JScrollPane(sourceArea);

        chooseButton.addActionListener(e -> chooseClassFile());

        add(chooseButton, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    private void chooseClassFile() {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File classFile = chooser.getSelectedFile();

            try {
                String javaCode = decompileClassFile(classFile);
                sourceArea.setText(javaCode);
            } catch (Exception e) {
                sourceArea.setText("Decompilation error: " + e.getMessage());
            }
        }
    }

    private String decompileClassFile(File classFile) throws IOException, InterruptedException {
        File outputDir = new File("decompiled");
        if (!outputDir.exists()) outputDir.mkdir();

        // Run the CFR decompiler as an external process
        ProcessBuilder pb = new ProcessBuilder(
            "java", "-jar", "cfr-0.152.jar", classFile.getAbsolutePath(),
            "--outputdir", outputDir.getAbsolutePath()
        );
        pb.redirectErrorStream(true);
        Process process = pb.start();
        process.waitFor();

        // Read the output Java file
        String javaFileName = classFile.getName().replace(".class", ".java");
        File javaFile = new File(outputDir, javaFileName);

        if (!javaFile.exists()) {
            throw new FileNotFoundException("Decompiler did not generate source file.");
        }

        return new String(java.nio.file.Files.readAllBytes(javaFile.toPath()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BytecodeToSource().setVisible(true));
    }
}
