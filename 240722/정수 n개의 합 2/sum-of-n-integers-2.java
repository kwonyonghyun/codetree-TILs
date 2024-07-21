import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        sc.nextLine();
        List<Integer> list=Arrays.stream(sc.nextLine().split(" ")).map(Integer::new).collect(Collectors.toList());
        List<Integer> dup=new ArrayList();
        dup.add(list.get(0));
        for(int i=1;i<n;i++){
            dup.add(dup.get(i-1)+list.get(i));
        }
        int result=Integer.MIN_VALUE;
        for(int i=0;i<n-k;i++){
            result=Math.max(result, dup.get(i+k)-dup.get(i));
        }
        System.out.println(result);
    }
}