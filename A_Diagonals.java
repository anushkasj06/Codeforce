import java.util.*;

public class A_Diagonals{
    public static void main(String[] anushkaArgs) {
        Scanner anushkaScanner = new Scanner(System.in);
        int anushkaTestCases = anushkaScanner.nextInt();

        while (anushkaTestCases-- > 0) {
            anushkaSolve(anushkaScanner);
        }
        anushkaScanner.close();
    }

    public static void anushkaSolve(Scanner anushkaIn) {
        int anushkaN = anushkaIn.nextInt();
        int anushkaK = anushkaIn.nextInt();

        List<Integer> anushkaList = new ArrayList<>();
        anushkaList.add(anushkaN);

        for (int anushkaI = 1; anushkaI < anushkaN; anushkaI++) {
            anushkaList.add(anushkaI);
            anushkaList.add(anushkaI);
        }

        // Sort in descending order
        anushkaList.sort(Collections.reverseOrder());

        int anushkaPointer = 0;

        while (anushkaK > 0) {
            int anushkaVal = anushkaList.get(anushkaPointer);
            if (anushkaVal > anushkaK) {
                anushkaPointer++;
                continue;
            }
            anushkaK -= anushkaVal;
            anushkaList.set(anushkaPointer, 0);
            anushkaPointer++;
        }

        // Count number of zeros
        int anushkaZeroCount = 0;
        for (int num : anushkaList) {
            if (num == 0) anushkaZeroCount++;
        }

        System.out.println(anushkaZeroCount);
    }
}