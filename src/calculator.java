import java.util.*;

public class calculator {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        char operator;
        double antwoord = 0.0;

        Scanner scanObject = new Scanner(System.in);

        //hier maak ik input mogenlijk

        System.out.println("Voer uw eerste getal in A.U.B.");
        num1 = scanObject.nextInt();
        System.out.println("Voer uw tweede getal in A.U.B.");
        num2 = scanObject.nextInt();
        System.out.println("Wilt u keer, delen plus of min doen?");
        operator = scanObject.next().charAt(0);

        //hier geef ik aan wat ik met de input wil, vervolgens gaat het programma dan kijken bij mijn functions

        switch (operator) {
            case '+':
                antwoord = plus(num1, num2);
                System.out.println(antwoord);
                break;
        }
        switch (operator) {
            case '-':
                antwoord = min(num1, num2);
                System.out.println(antwoord);
                break;
        }
        switch (operator) {
            case '*':
                antwoord = keer(num1, num2);
                System.out.println(antwoord);
                break;
        }
        switch (operator) {
            case '/':
                antwoord = delen(num1, num2);
                System.out.println(antwoord);
                break;
        }

    }
    //hier geef ik aan wat het programma moet doen met alle plus, min, keer en delen

    private static int plus(int num1, int num2) {
        return num1 + num2;
    }
    private static int min(int num1, int num2) {
        return num1 - num2;
    }
    private static int keer(int num1, int num2) {
        return num1 * num2;
    }
    private static int delen(int num1, int num2) {
        return num1 / num2;
    }
}