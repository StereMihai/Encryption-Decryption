package encryptdecrypt;

public class Main {


    public static void main(String[] args)  {
        Menu.menu();
    }
}
/* The code below is to pass JetBrain Academy tests
        String[] strings = new String[6];
        strings[0] = "";
        strings[1] = "";
        strings[2] = "";
        strings[3] = "";
        strings[4] = "";
        strings[5] = "";

        for (int j = 0; j < args.length; j++) {
            if (args[j].equals("-key")) {
                strings[1] = args[j + 1];

            }
        }
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-mode")) {
                strings[0] = args[i + 1];
            }

        }

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-data")) {
                strings[2] = args[i + 1];
            }
        }

        for (int i = 0; i<args.length - 1; i++) {
            if (args[i].equals("-alg")) {
                strings[5] = args[i+1];
            }
        }

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-in")) {
                strings[3] = args[i + 1];
            }
        }

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-out")) {
                strings[4] = args[i + 1];
            }
        }

        if (strings[0].equals("")) {
            strings[0] = "enc";
        }
        if (strings[1].equals("")) {
            strings[1] = "0";
        }
        if (strings[5].equals("")) {
            strings[5] = "shift";
        }


        //System.out.println(Arrays.toString(strings));

        String encOrDec = strings[0];
        int key = Integer.parseInt(strings[1]);
        String text = strings[2];
        String pathIN = strings[3];
        String pathOUT = strings[4];
        String alg = strings[5];


        String textToConvert = null;
        String convertedTextUnicode = null;
        StringBuilder convertedTextShift = null;

        EncryptionDecryption encryptionDecryption = new Algorithms(text, key, encOrDec);

        if (!text.equals("")) {
            switch (alg) {
                case "unicode":
                    System.out.println(encryptionDecryption.unicodeMethod(text, key, encOrDec));
                    break;
                case "shift" :
                    System.out.println(encryptionDecryption.shiftMethod(text, key, encOrDec));
                    break;
            }
        } else if(!pathIN.equals("")) {

            File file = new File(pathIN);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                textToConvert = scanner.nextLine();
            }
            scanner.close();
            switch (alg) {
                case "unicode":
                    if (pathOUT.equals("")) {
                        System.out.println(encryptionDecryption.unicodeMethod(textToConvert, key, encOrDec));
                    } else {
                        convertedTextUnicode = encryptionDecryption.unicodeMethod(textToConvert, key, encOrDec);
                        File file1 = new File(pathOUT);
                        try (FileWriter writer = new FileWriter(file1)) {
                            writer.write(convertedTextUnicode);
                        } catch (IOException e) {
                            System.out.printf("An exception occurs %s", e.getMessage());
                        }
                    }

                    break;
                case "shift" :
                    if (pathOUT.equals("")) {
                        System.out.println(encryptionDecryption.shiftMethod(textToConvert, key, encOrDec));
                    } else {
                        convertedTextShift = encryptionDecryption.shiftMethod(textToConvert, key, encOrDec);
                        File file1 = new File(pathOUT);
                        try (FileWriter writer = new FileWriter(file1)) {
                            writer.write(String.valueOf(convertedTextShift));
                        } catch (IOException e) {
                            System.out.printf("An exception occurs %s", e.getMessage());
                        }
                    }

                    break;
             }
            } else if (text.equals("") && pathIN.equals("")) {
                System.out.println("Error");
            }
        }

        }
*/
