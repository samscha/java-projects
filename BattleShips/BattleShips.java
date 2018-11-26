// import java.util.Scanner;

public class BattleShips {
    private static final int l = 10;
    private static final int w = 10;

    public static String[][] sea = new String[l][w];
    public static String[][] vertical = new String[1][l + 4];
    public static String[][] horizontal = new String[2][w + 4];

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                sea[i][j] = "   ";
            }
        }

        intro();
        print();
    }

    public static void print() {
        for (int i = 0; i < sea.length + 2; i++) {
            for (int j = 0; j < sea[0].length + 4; j++) {
                if (i == 0 || i - sea.length > 0) {
                    if (j - 2 < 0 || j - sea.length > 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j - 2 + "  ");
                    }

                    continue;
                }

                if (j == 0) {
                    System.out.print(i - 1 + " ");
                } else if (j - sea.length == 3) {
                    System.out.print(" ");
                    System.out.print(i - 1 + "");
                } else if (j == 1 || j - sea.length == 2) {
                    System.out.print("|");
                } else {
                    System.out.print(sea[i - 1][j - 2]);
                }
            }
            System.out.println();
        }
    }

    public static void intro() {
        System.out.println("**** Welcome to Battle Ships game ****\n");
        System.out.println("Right now, the sea is empty.\n");
    }
}
