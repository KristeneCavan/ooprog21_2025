public class TableAndChairs {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 22;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 1 || i == 2) && (j == 1 || j == 22)) {
                    System.out.print("X");
                }
                else if (i == 3 && (j == 1 || j == 22 || (j >= 7 && j <= 16))) {
                    System.out.print("X");
                }
                else if (i == 4 && (j <= 5 || j == 7 || j == 16 || j >= 18)) {
                    System.out.print("X");
                }
                else if ((i == 5 || i == 6) && (j == 1 || j == 5 || j == 7 || j == 16 || j == 18 || j == 22)) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
