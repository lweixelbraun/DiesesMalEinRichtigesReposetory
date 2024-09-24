public class GewinnModel {
    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {
        this.spielerZahl = 30;
        this.computerZahl = 30;
    }
    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }
    public void berechneComputerZahl(){
        this.computerZahl = (int)(Math.random() * 9 +1);
    }

    public void berechneRunde(int spielerZahl){

        this.spielerZahl = spielerZahl;

        if(spielerZahl == computerZahl ){
            gesamtPunkte += 20;
        }
        else if( Math.abs(spielerZahl-computerZahl) == 1){
            gesamtPunkte += 5;
        }
        else{ // Abweichung Spielerzahl und Computerzahl > 1
            gesamtPunkte -= 10;
        }
        if(gesamtPunkte >= 100){
            //todo gewonnen
        }
        if(gesamtPunkte <= 0){
            //todo verloren
        }
    }
}
