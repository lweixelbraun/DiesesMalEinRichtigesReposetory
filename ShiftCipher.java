public class ShiftCipher extends MonoAlphabeticCipher {
    private int shiftValue;

    public ShiftCipher(int shiftValue) {
        if(shiftValue >= 0 && shiftValue < ALPHABET.length()) {
            setShiftValue(shiftValue);
        }else throw new InvalidAlphabetException("zu hohe verschiebe zahl");
    }

    public void setShiftValue(int shiftValue) {
        this.shiftValue = shiftValue;
        String newAlphabet = "";

        for (int i = 0; i < ALPHABET.length(); i++) {
            // Berechne den verschobenen Index
            int shiftedIndex = (i + shiftValue) % ALPHABET.length();
            newAlphabet += ALPHABET.charAt(shiftedIndex);
        }

        secretAlphabet = newAlphabet;
    }

    @Override
    public String getDescription() {
        String description = "Keine Verschlüsselung";
        ShiftCipher shiftCipher = (ShiftCipher) this;
        description = "Verschiebung(" + shiftCipher.getShiftValue() + ")";
        super.getDescription();
        return description;
    }

    public int getShiftValue(){
        return shiftValue;
    }

}
