package morse;

import java.util.Scanner;

public class MorseMain {
    static void main() {
        MorseCodeConverter converter = new MorseCodeConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till Morse-kod");

        while (true) {
            System.out.println("1: Text till Morse");
            System.out.println("2: Morse till Text");
            System.out.println("3: Avsluta");
            System.out.print("Välj alternativ (1|2|3): ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mata in en ett av alternativen (1|2|3)");
                System.out.println();
                scanner.nextLine();
                continue;
            }

            if (choice == 1) {
                System.out.print("Skriv något på ENGELSKA: ");
                String text = scanner.nextLine();
                System.out.println("morsekod: " + converter.englishToMorse(text));
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Ange morsekod (separata mellanslag): ");
                String morse = scanner.nextLine();
                System.out.println("Engelsk text: " + converter.morseToEnglish(morse));
                System.out.println();
            } else if (choice == 3) {
                System.out.print("Avslut!");
                scanner.close();
                break;
            }
            else {
                System.out.println("Ogiltigt val! välj 1 eller 2");
            }
        }
    }
}
