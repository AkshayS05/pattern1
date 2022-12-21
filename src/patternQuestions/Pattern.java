package patternQuestions;

public class Pattern {
    public static void main(String[] args) {
        printPattern(4);
    }

    private static void printPattern(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
