package InterviewChallenge;

public class ShirtChallenge {

    public static void main(String[] args) {
        System.out.println(sortSizes("LMSSLLMS"));

    }

    public static String sortSizes(String T){

        StringBuilder newT = new StringBuilder();
        int sCount = 0, mCount = 0, lCount = 0;

        for (int i = 0; i < T.length(); i++)
            switch (T.charAt(i)) {
                case 'S' -> sCount++;
                case 'M' -> mCount++;
                case 'L' -> lCount++;
            }

        newT.
                append("S".repeat(Math.max(0, sCount))).
                append("M".repeat(Math.max(0, mCount))).
                append("L".repeat(Math.max(0, lCount)));

        return newT.toString();
    }
}
