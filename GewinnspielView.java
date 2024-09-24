import javax.swing.*;
import java.awt.*;

public class GewinnspielView  extends JFrame{
    JLabel punkte, ergebnis, gesamtPunkteZahl, punkteErgebnis, computer;
    JTextField spielerZahl;
    JButton nochmal;
    public GewinnspielView() {
        super("Gewinnspiel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2, 2));

        punkte = new JLabel("Punkte gesamt:");
        ergebnis = new JLabel("Aktuelles Ergebnis: ");
        gesamtPunkteZahl = new JLabel();
        punkteErgebnis = new JLabel("0");
        gesamtPunkteZahl.setOpaque(true);
        punkteErgebnis.setOpaque(true);
        topPanel.add(punkte);
        topPanel.add(ergebnis);
        topPanel.add(gesamtPunkteZahl);
        topPanel.add(punkteErgebnis);

        add(topPanel);

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(2, 2));

        middlePanel.add(new JLabel("Zahl für nächste Runde: "));
        middlePanel.add(new JLabel(" Computerzahl:"));
        spielerZahl = new JTextField(1);
        computer = new JLabel("");
        middlePanel.add(spielerZahl);
        middlePanel.add(computer);
        add(middlePanel);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        nochmal = new JButton("Noch einmal!");
        bottomPanel.add(nochmal);
        add(bottomPanel);
    }
    public void setComputerZahl(String zahl){
        computer.setText(zahl);
    }
}

