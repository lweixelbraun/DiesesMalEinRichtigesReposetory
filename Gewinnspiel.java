public class Gewinnspiel {
    public static void main(String[] args) {
        GewinnModel model = new GewinnModel();
        GewinnspielView view = new GewinnspielView();
        new GewinnSpielController(model, view);
        view.setVisible(true);
    }
}
