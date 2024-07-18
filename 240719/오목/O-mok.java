import java.util.*;
public class Main {
    public static boolean blackWinVertical(int x,int y,List<List<Integer>> board){
        for(int i=0;i<5;i++){
            if(x+i>18||board.get(x+i).get(y)==2||board.get(x+i).get(y)==0){
                return false;
            }
        }
        return true;
    }
    public static boolean whiteWinVertical(int x,int y,List<List<Integer>> board){
        for(int i=0;i<5;i++){
            if(x+i>18||board.get(x+i).get(y)==1||board.get(x+i).get(y)==0){
                return false;
            }
        }
        return true;
    }
    public static boolean blackWinHorizontal(int x,int y,List<List<Integer>> board){
        for(int i=0;i<5;i++){
            if(y+i>18||board.get(x).get(y+i)==2||board.get(x).get(y+i)==0){
                return false;
            }
        }
        return true;
    }
    public static boolean whiteWinHorizontal(int x,int y,List<List<Integer>> board){
        for(int i=0;i<5;i++){
            if(y+i>18||board.get(x).get(y+i)==1||board.get(x).get(y+i)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> board=new ArrayList();
        for(int i=0;i<19;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<19;j++){
                row.add(sc.nextInt());
            }
            board.add(row);

        }
        boolean black=false;
        boolean white=false;
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){

                if(whiteWinHorizontal(i,j,board) || blackWinHorizontal(i,j,board)){
                    System.out.println(board.get(i).get(j));
                    System.out.println(i+1+" "+(j+3));
                    return;
                }else{
                    if(whiteWinVertical(i,j,board)||blackWinVertical(i,j,board)){
                        System.out.println(board.get(i).get(j));
                        System.out.println(i+1+" "+(j+3));
                        return;
                    }
                }
            }
        }
    }
}