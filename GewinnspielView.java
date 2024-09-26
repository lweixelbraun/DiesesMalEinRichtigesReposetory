import javax.swing.*;
import java.awt.*;
public class GewinnspielView  extends JFrame{
    JLabel punkte, ergebnis, gesamtPunkte, rundenErgebnis, computerZahl;
    JTextField spielerZahl;
    JButton nochmaleinmal;
    public GewinnspielView() {
        super("Gewinnspiel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2,2));

        punkte = new JLabel("Punkte gesamt:");
        ergebnis = new JLabel("Aktuelles Ergebnis: ");
        gesamtPunkte = new JLabel();
        rundenErgebnis = new JLabel("0");
        gesamtPunkte.setOpaque(true);
        rundenErgebnis.setOpaque(true);

        topPanel.add(punkte);
        topPanel.add(ergebnis);
        topPanel.add(gesamtPunkte);
        topPanel.add(rundenErgebnis);
        add(topPanel, BorderLayout.NORTH);

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(2, 2));
        middlePanel.add(new JLabel("Zahl für nächste Runde: "));
        middlePanel.add(new JLabel(" Computerzahl:"));
        spielerZahl = new JTextField(1);
        computerZahl = new JLabel("");

        middlePanel.add(spielerZahl);
        middlePanel.add(computerZahl);
        add(middlePanel, BorderLayout.CENTER);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        nochmaleinmal = new JButton("Noch einmal!");
        bottomPanel.add(nochmaleinmal);
        add(bottomPanel, BorderLayout.SOUTH);
    }
    public void setComputerZahl(String zahl){
        computerZahl.setText(zahl);
    }
}

