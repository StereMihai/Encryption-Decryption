package encryptdecrypt;

import java.util.Scanner;


// Simple class for checking enc/dec algorithms

public class Menu {

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter wanted method for encryption/decryption (shift or unicode):  ");
        String alg = scanner.nextLine();
        System.out.print("Please enter text to encrypt or decrypt: ");
        String text = scanner.nextLine();
        System.out.print("Please enter the key: ");
        int key = scanner.nextInt();
        System.out.print("Please enter if you want to encrypt or decrypt text (enc or dec): ");
        String encOrDec = scanner.next();
        scanner.close();

        EncryptionDecryption encryptionDecryption = new Algorithms();
        encryptionDecryption.doEncryptionOrDecryption(text,key, encOrDec, alg);



    }


}
