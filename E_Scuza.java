import java.util.*;

public class E_Scuza{
    // Binary search to find largest index where max prefix <= value
    public static int anushkaBinarySearch(List<Long> anushkaPrefixMax, int anushkaN, long anushkaValue) {
        int anushkaLow = 0, anushkaHigh = anushkaN - 1, anushkaAnswer = -1;

        while (anushkaLow <= anushkaHigh) {
            int anushkaMid = (anushkaLow + anushkaHigh) / 2;

            if (anushkaPrefixMax.get(anushkaMid) <= anushkaValue) {
                anushkaAnswer = anushkaMid;
                anushkaLow = anushkaMid + 1;
            } else {
                anushkaHigh = anushkaMid - 1;
            }
        }

        return anushkaAnswer;
    }

    public static void main(String[] anushkaArgs) {
        Scanner anushkaScanner = new Scanner(System.in);
        int anushkaTests = anushkaScanner.nextInt();

        while (anushkaTests-- > 0) {
            int anushkaN = anushkaScanner.nextInt();
            int anushkaQ = anushkaScanner.nextInt();

            long[] anushkaSteps = new long[anushkaN];
            long[] anushkaQueries = new long[anushkaQ];

            for (int anushkaI = 0; anushkaI < anushkaN; anushkaI++) {
                anushkaSteps[anushkaI] = anushkaScanner.nextLong();
            }

            for (int anushkaI = 0; anushkaI < anushkaQ; anushkaI++) {
                anushkaQueries[anushkaI] = anushkaScanner.nextLong();
            }

            List<Long> anushkaPrefixMax = new ArrayList<>();
            List<Long> anushkaPrefixSum = new ArrayList<>();

            anushkaPrefixMax.add(anushkaSteps[0]);
            anushkaPrefixSum.add(anushkaSteps[0]);

            for (int anushkaI = 1; anushkaI < anushkaN; anushkaI++) {
                long anushkaMax = Math.max(anushkaPrefixMax.get(anushkaI - 1), anushkaSteps[anushkaI]);
                anushkaPrefixMax.add(anushkaMax);

                long anushkaSum = anushkaPrefixSum.get(anushkaI - 1) + anushkaSteps[anushkaI];
                anushkaPrefixSum.add(anushkaSum);
            }

            for (int anushkaI = 0; anushkaI < anushkaQ; anushkaI++) {
                long anushkaQueryValue = anushkaQueries[anushkaI];
                int anushkaIndex = anushkaBinarySearch(anushkaPrefixMax, anushkaN, anushkaQueryValue);

                if (anushkaIndex == -1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(anushkaPrefixSum.get(anushkaIndex) + " ");
                }
            }

            System.out.println();
        }

        anushkaScanner.close();
    }
}