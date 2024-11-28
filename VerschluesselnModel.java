public class VerschluesselnModel {
    private MonoAlphabeticCipher cipher;

    public VerschluesselnModel(String initialCipherType){
        setCipher(initialCipherType);
    }

    public void setCipher(String cipherType) {
        if (cipherType.equals("Shift Cipher")) {
            cipher = new ShiftCipher(5);
        } else if (cipherType.equals("Substitution Cipher")) {
            cipher = new SubstitutionCipher("zyxwvutsrqponmlkjihgfedcbaäöüß");
        } else {
            cipher = null;
        }
    }

    // Verschlüsselt den Text mit der aktuellen Verschlüsselungsmethode
    public String encrypt(String inputText) {

        return cipher.encrypt(inputText);
    }

    // Entschlüsselt den Text mit der aktuellen Verschlüsselungsmethode
    public String decrypt(String inputText) {
        return cipher.decrypt(inputText);
    }

    public String description(){
        MonoAlphabeticCipher c = new ShiftCipher(3);
        if (c instanceof ShiftCipher) {
            ShiftCipher s = (ShiftCipher) c;

        }
        return cipher.getDescription();
    }

}
