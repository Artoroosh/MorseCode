
// Corbin Nash
 // 13/09/2018
 // The program

package morsecode;
import javax.swing.JOptionPane;
public class MorseCode {
    public static void main(String[] args) {
        //We set up variables
        String userInputMessage = "";
        String morseCode = "";
        String letter;
        //We get the user to input a messager
        userInputMessage = JOptionPane.showInputDialog("Enter your message to be translated into morse code.");
        //Convert the message into morse code
        for (int i = 0; i < userInputMessage.length(); i++) {
            letter = Character.toString(userInputMessage.charAt(i));
                   //setup all cases into morse code
            if (letter.equalsIgnoreCase("a")) {
                morseCode += ".- ";
            } else if (letter.equalsIgnoreCase("b")) {
                morseCode += "-... ";
            } else if (letter.equalsIgnoreCase("c")) {
                morseCode += "-.-. ";
            } else if (letter.equalsIgnoreCase("d")) {
                morseCode += "-.. ";
            } else if (letter.equalsIgnoreCase("e")) {
                morseCode += ". ";
            } else if (letter.equalsIgnoreCase("f")) {
                morseCode += "..-. ";
            } else if (letter.equalsIgnoreCase("g")) {
                morseCode += "--. ";
            } else if (letter.equalsIgnoreCase("h")) {
                morseCode += ".... ";
            } else if (letter.equalsIgnoreCase("i")) {
                morseCode += ".. ";
            } else if (letter.equalsIgnoreCase("j")) {
                morseCode += ".--- ";
            } else if (letter.equalsIgnoreCase("k")) {
                morseCode += "-.- ";
            } else if (letter.equalsIgnoreCase("l")) {
                morseCode += ".-.. ";
            } else if (letter.equalsIgnoreCase("m")) {
                morseCode += "-- ";
            } else if (letter.equalsIgnoreCase("n")) {
                morseCode += "-. ";
            } else if (letter.equalsIgnoreCase("o")) {
                morseCode += "--- ";
            } else if (letter.equalsIgnoreCase("p")) {
                morseCode += ".--. ";
            } else if (letter.equalsIgnoreCase("q")) {
                morseCode += "--.- ";
            } else if (letter.equalsIgnoreCase("r")) {
                morseCode += ".-. ";
            } else if (letter.equalsIgnoreCase("s")) {
                morseCode += "... ";
            } else if (letter.equalsIgnoreCase("t")) {
                morseCode += "- ";
            } else if (letter.equalsIgnoreCase("u")) {
                morseCode += "..- ";
            } else if (letter.equalsIgnoreCase("v")) {
                morseCode += "...- ";
            } else if (letter.equalsIgnoreCase("w")) {
                morseCode += ".-- ";
            } else if (letter.equalsIgnoreCase("x")) {
                morseCode += "-..- ";
            } else if (letter.equalsIgnoreCase("y")) {
                morseCode += "-.-- ";
            } else if (letter.equalsIgnoreCase("z")) {
                morseCode += "--.. ";
            } else if (letter.equals("0")) {
                morseCode += "----- ";
            } else if (letter.equals("1")) {
                morseCode += ".---- ";
            } else if (letter.equals("2")) {
                morseCode += "..--- ";
            } else if (letter.equals("3")) {
                morseCode += "...-- ";
            } else if (letter.equals("4")) {
                morseCode += "....- ";
            } else if (letter.equals("5")) {
                morseCode += "..... ";
            } else if (letter.equals("6")) {
                morseCode += "-.... ";
            } else if (letter.equals("7")) {
                morseCode += "--... ";
            } else if (letter.equals("8")) {
                morseCode += "---.. ";
            } else if (letter.equals("9")) {
                morseCode += "----. ";
            } else if (letter.equals(" ")) {
                morseCode += " ";
            }
        }
        System.out.println("Phrase: " + userInputMessage
                + "\nMorse Code: " + morseCode);
    } 
}
