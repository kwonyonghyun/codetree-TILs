import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        List<Integer> A=Arrays.stream(sc.nextLine().split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
        List<Integer> B=Arrays.stream(sc.nextLine().split(" "))
        .map(Integer::parseInt)
        .sorted()
        .collect(Collectors.toList());
        int cnt=0;
        for(int i=0;i<A.size()-B.size()+1;i++){
            List<Integer> sortedSub = new ArrayList(A.subList(i,i+B.size()));
            Collections.sort(sortedSub);
            if(sortedSub.equals(B)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}