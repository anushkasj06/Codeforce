import java.util.*;

public class B_Square_Pool{
    public static void main(String[] anushkaArgs) {
        Scanner anushkaScanner = new Scanner(System.in);
        int anushkaTestCases = anushkaScanner.nextInt();

        while (anushkaTestCases-- > 0) {
            anushkaSolve(anushkaScanner);
        }

        anushkaScanner.close();
    }

    public static void anushkaSolve(Scanner anushkaInput) {
        int anushkaNumPoints = anushkaInput.nextInt();
        int anushkaStep = anushkaInput.nextInt();
        int anushkaCounter = 0;

        for (int anushkaIndex = 0; anushkaIndex < anushkaNumPoints; anushkaIndex++) {
            int anushkaDx = anushkaInput.nextInt();
            int anushkaDy = anushkaInput.nextInt();
            int anushkaX = anushkaInput.nextInt();
            int anushkaY = anushkaInput.nextInt();

            if (anushkaDx == anushkaDy) {
                if ((anushkaX - anushkaY) % anushkaStep == 0) {
                    anushkaCounter++;
                }
            } else {
                if ((anushkaX + anushkaY) % anushkaStep == 0) {
                    anushkaCounter++;
                }
            }
        }

        System.out.println(anushkaCounter);
    }
}