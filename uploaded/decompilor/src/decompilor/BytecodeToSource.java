package decompilor;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class BytecodeToSource extends JFrame {
    private JButton browseButton;
    private JTextArea resultArea;

    public BytecodeToSource() {
        setTitle("Bytecode to Source Code Converter");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        browseButton = new JButton("Select .class File");
        resultArea = new JTextArea();
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(resultArea);

        browseButton.addActionListener(e -> chooseClassFile());

        add(browseButton, "North");
        add(scrollPane, "Center");
    }

    private void chooseClassFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION) {
            File classFile = fileChooser.getSelectedFile();
            try {
                String decompiledCode = decompileClassFile(classFile);
                resultArea.setText(decompiledCode);
            } catch (IOException | InterruptedException ex) {
                resultArea.setText("Error during decompilation: " + ex.getMessage());
            }
        }
    }

    private String decompileClassFile(File classFile) throws IOException, InterruptedException {
        File outputDir = new File("decompiled_output");
        outputDir.mkdir();

        ProcessBuilder pb = new ProcessBuilder(
            "java", "-jar", "cfr.jar", classFile.getAbsolutePath(),
            "--outputdir", outputDir.getAbsolutePath()
        );
        pb.redirectErrorStream(true);

        Process process = pb.start();
        process.waitFor();

        // Read the decompiled file
        String fileName = classFile.getName().replace(".class", ".java");
        File sourceFile = new File(outputDir, fileName);

        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Decompiler failed to produce source code.");
        }

        return new String(java.nio.file.Files.readAllBytes(sourceFile.toPath()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BytecodeToSource().setVisible(true);
        });
    }
}
