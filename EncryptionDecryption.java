package encryptdecrypt;

abstract class EncryptionDecryption {

    public void doEncryptionOrDecryption(String text, int key, String encOrDec, String alg){
        if (alg.equals("unicode")) {
            System.out.println(unicodeMethod(text, key, encOrDec));
        } else if (alg.equals("shift")) {
            System.out.println(shiftMethod(text, key, encOrDec));
        }
    }
    public abstract String unicodeMethod(String text, int key, String encOrDec);
    public abstract StringBuilder shiftMethod(String text, int key, String encOrDec);
}
