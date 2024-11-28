import javax.swing.*;
import java.awt.*;
public class VerschluesselnView extends JFrame{
    public static JComboBox<String> cipherChoiceBox;
    public JTextField inputField;
    public JButton encryptButton;
    public JButton decryptButton;
    public JLabel description;

    public VerschluesselnView() {
        super("Verschluesseln - Lara Weixelbraun");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        cipherChoiceBox = new JComboBox<>(new String[]{"Shift Cipher", "Substitution Cipher"});
        inputField = new JTextField(20);
        encryptButton = new JButton("Verschlüsseln");
        decryptButton = new JButton("Entschlüsseln");
        description = new JLabel("Keine Verschlüsselung");

        add(new JLabel("Wählen Sie eine Verschlüsselung:"));
        add(cipherChoiceBox);
        add(new JLabel("Text:"));
        add(inputField);
        add(encryptButton);
        add(decryptButton);
        add(description);

    }

    public String getSelectedCipher() {
        return (String) cipherChoiceBox.getSelectedItem();
    }

    // Getter für das eingegebene Textfeld (JTextField)
    public String getInputText() {
        return inputField.getText();
    }

}
