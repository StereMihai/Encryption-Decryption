package encryptdecrypt;

public class Algorithms extends EncryptionDecryption {
    

    @Override
    public StringBuilder shiftMethod(String text, int key, String encOrDec) {
        StringBuilder result = new StringBuilder();
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {

                chars[i] = text.charAt(i);

        }

        switch (encOrDec) {
            case "enc":
                for (int j = 0; j < chars.length; j++) {
                    if (Character.isLetter(text.charAt(j))) {
                        if (Character.isLowerCase(text.charAt(j))) {
                            int originalAlphabetPosition = chars[j] - 'a';
                            int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                            char newCharacter = (char) ('a' + newAlphabetPosition);
                            result.append(newCharacter);
                        } else {
                            int originalAlphabetPosition = chars[j] - 'A';
                            int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                            char newCharacter = (char) ('A' + newAlphabetPosition);
                            result.append(newCharacter);
                        }
                    } else {
                        result.append(chars[j]);
                    }

                }
                break;
            case "dec":
                for (int j = 0; j < chars.length; j++) {
                    if (Character.isLetter(text.charAt(j))) {
                        if (Character.isLowerCase(text.charAt(j))) {
                            int originalAlphabetPosition = chars[j] - 'a';
                            int newAlphabetPosition = (originalAlphabetPosition + (26 - key % 26)) % 26 ;
                            char newCharacter = (char) ('a' + newAlphabetPosition);
                            result.append(newCharacter);
                        } else {
                            int originalAlphabetPosition = chars[j] - 'A';
                            int newAlphabetPosition = (originalAlphabetPosition + (26 - key % 26)) % 26;
                            char newCharacter = (char) ('A' + newAlphabetPosition);
                            result.append(newCharacter);
                        }
                    } else {
                        result.append(chars[j]);
                    }

                }
        }
        return result;
    }
    @Override
    public String unicodeMethod(String text, int key, String encOrDec) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        switch (encOrDec) {
            case "enc":
                for (int j = 0; j < text.length(); j++) {
                    chars[j] = (char) (chars[j] + key);
                }
                break;
            case "dec":
                for (int j = 0; j < text.length(); j++) {
                    chars[j] = (char) (chars[j] - key);
                }
                break;
        }

        String outputString = new String(chars);
        return outputString;
    }
}
