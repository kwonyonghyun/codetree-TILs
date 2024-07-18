import java.util.*;

public class Main {
    public static boolean blackWinVertical(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (x + i > 18 || board.get(x + i).get(y) == 2 || board.get(x + i).get(y) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean whiteWinVertical(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (x + i > 18 || board.get(x + i).get(y) == 1 || board.get(x + i).get(y) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean blackWinHorizontal(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (y + i > 18 || board.get(x).get(y + i) == 2 || board.get(x).get(y + i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean whiteWinHorizontal(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (y + i > 18 || board.get(x).get(y + i) == 1 || board.get(x).get(y + i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean blackWinDiagRight(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (x + i > 18 || y + i > 18 || board.get(x + i).get(y + i) == 2 || board.get(x + i).get(y + i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean whiteWinDiagRight(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (x + i > 18 || y + i > 18 || board.get(x + i).get(y + i) == 1 || board.get(x + i).get(y + i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean blackWinDiagLeft(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (x + i > 18 || y - i < 0 || board.get(x + i).get(y - i) == 2 || board.get(x + i).get(y - i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean whiteWinDiagLeft(int x, int y, List<List<Integer>> board) {
        for (int i = 0; i < 5; i++) {
            if (x + i > 18 || y - i < 0 || board.get(x + i).get(y - i) == 1 || board.get(x + i).get(y - i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> board = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 19; j++) {
                row.add(sc.nextInt());
            }
            board.add(row);
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (blackWinHorizontal(i, j, board)) {
                    System.out.println(1);
                    System.out.println((i + 1) + " " + (j + 3)); // j+2 for middle index in 5 (0-based)
                    return;
                } else if (whiteWinHorizontal(i, j, board)) {
                    System.out.println(2);
                    System.out.println((i + 1) + " " + (j + 3));
                    return;
                } else if (blackWinVertical(i, j, board)) {
                    System.out.println(1);
                    System.out.println((i + 3) + " " + (j + 1)); 
                    return;
                } else if (whiteWinVertical(i, j, board)) {
                    System.out.println(2);
                    System.out.println((i + 3) + " " + (j + 1));
                    return;
                } else if (blackWinDiagRight(i, j, board)) {
                    System.out.println(1);
                    System.out.println((i + 3) + " " + (j + 3)); 
                    return;
                } else if (whiteWinDiagRight(i, j, board)) {
                    System.out.println(2);
                    System.out.println((i + 3) + " " + (j + 3)); 
                    return;
                } else if (blackWinDiagLeft(i, j, board)) {
                    System.out.println(1);
                    System.out.println((i + 3) + " " + (j - 1));
                    return;
                } else if (whiteWinDiagLeft(i, j, board)) {
                    System.out.println(2);
                    System.out.println((i + 3) + " " + (j - 1)); 
                    return;
                }
            }
        }
        System.out.println(0);
    }
}