import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
public class VerschluesselnController {
    private VerschluesselnModel model;
    private VerschluesselnView view;

    public VerschluesselnController(VerschluesselnModel model, VerschluesselnView view) {
        this.model = model;
        this.view = view;

        view.encryptButton.addActionListener(new ButtonActionListener());

        view.decryptButton.addActionListener(new ButtonActionListener());

        view.cipherChoiceBox.addActionListener(e -> updateDescription());
    }

    private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String einfuegeText = "";
            String cipherType = (String) view.getSelectedCipher();
            if(view.getInputText() != null){
                model.setCipher(cipherType);
                if(e.getSource()==view.encryptButton){
                    if(view.getSelectedCipher().equals("Shift Cipher")) {
                        einfuegeText = "[Verschlüsselung] " + view.getInputText() + " -> " + model.encrypt(view.getInputText());
                        einfuegeText = einfuegeText + "\n[Auswahl] " + model.description();
                        view.description.setText(einfuegeText);
                    }else if(view.getSelectedCipher().equals("Substitution Cipher")){
                        einfuegeText = "[Auswechslung] " + view.getInputText() + " -> " + model.encrypt(view.getInputText());
                        einfuegeText = einfuegeText + "\n[Auswahl] " + model.description();
                        view.description.setText(einfuegeText);

                    }
                } else if(e.getSource() == view.decryptButton){
                    if(view.getSelectedCipher().equals("Shift Cipher")) {
                        einfuegeText = "[Verschlüsselung] " + view.getInputText() + " -> " + model.decrypt(view.getInputText());
                        einfuegeText = einfuegeText + "\n[Auswahl] " + model.description();
                        view.description.setText(einfuegeText);
                    }else if(view.getSelectedCipher().equals("Substitution Cipher")){
                        einfuegeText = "[Auswechslung] " + view.getInputText() + " -> " + model.decrypt(view.getInputText());
                        einfuegeText = einfuegeText + "\n[Auswahl] " + model.description();
                        view.description.setText(einfuegeText);

                    }
                }
            }
        }
    }


    // Methode zur Anzeige der aktuellen Verschlüsselungsmethode
    private void updateDescription() {
        String cipherType = (String) view.getSelectedCipher();

        if (cipherType.equals("Shift Cipher")) {
            System.out.println("Aktuell gewählte Verschlüsselung: Verschiebung");
        } else if (cipherType.equals("Substitution Cipher")) {
            System.out.println("Aktuell gewählte Verschlüsselung: Substitution");
        }
    }

}
