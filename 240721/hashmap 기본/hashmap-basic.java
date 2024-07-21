import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            if (arr[0].equals("add")) {
                int key = Integer.parseInt(arr[1]);
                int value = Integer.parseInt(arr[2]);
                map.put(key, value);
            } else if (arr[0].equals("find")) {
                int key = Integer.parseInt(arr[1]);
                if (map.get(key)==null) {
                    System.out.println("None");
                    continue;
                }
                System.out.println(map.get(key));
            } else if (arr[0].equals("remove")) {
                int key = Integer.parseInt(arr[1]);
                map.remove(key);
            }
        }
    }
}