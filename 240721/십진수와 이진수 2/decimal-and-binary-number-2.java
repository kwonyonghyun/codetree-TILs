import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int temp=Integer.parseInt(n,2)*17;
        System.out.println(Integer.toString(temp,2));
    }
}