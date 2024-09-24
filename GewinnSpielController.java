import java.awt.*;

public class GewinnSpielController {

    private final GewinnspielView view;
    private final GewinnModel model;
    public GewinnSpielController(GewinnModel model, GewinnspielView view) {
        this.view = view;
        this.model = model;

        this.view.gesamtPunkteZahl.setText(String.valueOf(model.getGesamtPunkte()));
        view.nochmal.addActionListener(e->this.nochmal());

        this.view.spielerZahl.addActionListener(e->this.spielerZahlEntered());

    }
    private void spielerZahlEntered() {
        if(!view.spielerZahl.isEditable()) return;

        if(view.spielerZahl.getText().isEmpty()) return; // Keine Eingabe soll zu nichts führen
        int spielerZahl;

        try{
            spielerZahl = Integer.parseInt(view.spielerZahl.getText());
            if(spielerZahl <= 0  || spielerZahl >= 10) return;
        }
        catch (Exception e){
            return;
        }
        view.spielerZahl.setEditable(false);

        model.berechneComputerZahl();
        int cz = model.getComputerZahl();
        view.setComputerZahl( String.valueOf(cz));

        model.berechneRunde(spielerZahl);
        int rundenErgebnis = model.getRundenErgebnis();
        view.punkteErgebnis.setText( String.valueOf(rundenErgebnis) );

        int gesamtPunkte = model.getGesamtPunkte();
        if(gesamtPunkte <= 0) {
            view.gesamtPunkteZahl.setText("VERLOREN");
            view.gesamtPunkteZahl.setBackground(Color.RED);
        }

        if(gesamtPunkte >= 100) {
            view.gesamtPunkteZahl.setText("GEWONNEN");
            view.gesamtPunkteZahl.setBackground(Color.GREEN);
        }

        if(rundenErgebnis > 0){
            view.punkteErgebnis.setBackground(Color.GREEN);
        }
        else{
            view.punkteErgebnis.setBackground(Color.RED);
        }
    }
    public void nochmal() {
        System.out.println("Der Button, wurde geclickt ;-)");
        view.spielerZahl.setText("");
        view.spielerZahl.setEditable(true);
        view.punkteErgebnis.setBackground(null);
    }
}
