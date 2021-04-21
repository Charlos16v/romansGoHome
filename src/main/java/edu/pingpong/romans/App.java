package edu.pingpong.romans;

import edu.pingpong.romans.domain.RomanNumber;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        String entradaConfirmacion = "";

        while (!entradaConfirmacion.equals("N")) {
            System.out.println("========ROMAN NUMERAL TO DECIMAL!========");
            System.out.println("Type a Roman Numeral:");
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner(System.in);
            entradaTeclado = entradaEscaner.nextLine();


            RomanNumber romanNumber = new RomanNumber();
            romanNumber.initRegexList();
            romanNumber.setRomanNumber(entradaTeclado);

            if (romanNumber.isValidRomanNumber()) {
                System.out.println("The value of " + entradaTeclado + " in decimal is: " + romanNumber.convertToDecimal());

                System.out.println("=========================================" + '\n' + '\n' + '\n');

                System.out.println("========OTHER TIME?========!");
                System.out.println('\n' + "Y/N");

                Scanner entradaEscanerConfirmacion = new Scanner(System.in);
                entradaConfirmacion = entradaEscanerConfirmacion.nextLine();
                clearScreen();
            } else {
                System.out.println("The number " + entradaTeclado + " is not a valid Roman Numeral :(");
            }
        }
        clearScreen();
        System.out.println('\n' + "BYE!");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
