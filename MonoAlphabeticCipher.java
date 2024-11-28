public class MonoAlphabeticCipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzäöüß";
    protected String secretAlphabet = ALPHABET;


    public String encrypt(String text) {
        text = text.toLowerCase();
        String result = "";

        for (int k = 0; k < text.length(); k++) {
            char currentChar = text.charAt(k);

            int index = ALPHABET.indexOf(currentChar);

            if (index != -1) {
                result += secretAlphabet.charAt(index);
            } else {
                // Unveränderte Zeichen (z.B. Leerzeichen oder Sonderzeichen) hinzufügen
                result += currentChar;
            }
        }

        return result;
    }

    public String decrypt(String text) {
        text = text.toLowerCase();
        String result = "";

        for (int k = 0; k < text.length(); k++) {
            char currentChar = text.charAt(k);

            int index = secretAlphabet.indexOf(currentChar);

            if (index != -1) {
                result += ALPHABET.charAt(index);
            } else {
                // Unveränderte Zeichen (z.B. Leerzeichen oder Sonderzeichen) hinzufügen
                result += currentChar;
            }
        }

        return result;
    }

    public String getSecretAlphabet(){
        return secretAlphabet;
    }

    protected void setSecretAlphabet(String secretAlphabet){
        this.secretAlphabet = secretAlphabet;
    }

    public String getDescription() {
        String description = "Keine Verschlüsselung";
        return description;
    }


}
