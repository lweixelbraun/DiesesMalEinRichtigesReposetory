public class Main {
    public static void main(String[] args) {
        VerschluesselnView view = new VerschluesselnView();

        // Standardmäßig die erste Auswahl der JComboBox nutzen
        String initialCipherType = view.getSelectedCipher();
        VerschluesselnModel model = new VerschluesselnModel(initialCipherType);

        VerschluesselnController controller = new VerschluesselnController(model, view);
        view.setVisible(true);
    }

}
