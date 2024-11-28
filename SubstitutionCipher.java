public class SubstitutionCipher extends MonoAlphabeticCipher{
    public SubstitutionCipher(String secretAlphabet) {
        if (isValidAlphabet(secretAlphabet)) {
            setSecretAlphabet(secretAlphabet);
        } else {
            throw new InvalidAlphabetException("Ungültiges Geheimalphabet");
        }
    }

    private boolean isValidAlphabet(String alphabet) {
        if (alphabet.length() != 30){
            return false;
        }
        for(int i = 0; i < 30; i++){
            if(!Character.isLetter(alphabet.charAt(i))){
                return false;
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < alphabet.length(); i++) {
                if (alphabet.charAt(i) == c) {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

}
