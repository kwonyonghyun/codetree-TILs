import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        List<int[]> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int position = sc.nextInt();
            char type = sc.next().charAt(0);
            int score = (type == 'G') ? 1 : 2;
            people.add(new int[] {position, score});
        }

        people.sort(Comparator.comparingInt(a -> a[0]));

        int maxScore = 0;
        int currentScore = 0;
        int start = 0;

        for (int end = 0; end < N; end++) {
            currentScore += people.get(end)[1];

            while (people.get(end)[0] - people.get(start)[0] > K) {
                currentScore -= people.get(start)[1];
                start++;
            }

            maxScore = Math.max(maxScore, currentScore);
        }

        System.out.println(maxScore);
    }
}