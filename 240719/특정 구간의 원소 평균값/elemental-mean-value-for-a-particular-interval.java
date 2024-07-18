import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        int count = 0;

        for (int start = 0; start < N; start++) {
            int sum = 0;
            for (int end = start; end < N; end++) {
                sum += arr[end];
                int length = end - start + 1;
                if (sum % length == 0) {
                    int average = sum / length;
                    if (contains(arr, start, end, average)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    private static boolean contains(int[] arr, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}