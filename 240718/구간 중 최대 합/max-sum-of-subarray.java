import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> list=new ArrayList();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int maxVal=Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++){
            int result=0;
            for(int j=0;j<k;j++){
                result+=list.get(i+j);
            }
            maxVal=Math.max(result,maxVal);
        }
        System.out.println(maxVal);
        
    }
}