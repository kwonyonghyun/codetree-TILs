import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String n=sc.nextLine();
        int temp=Integer.parseInt(n,a);
        System.out.println(Integer.toString(temp,b));
    }
}