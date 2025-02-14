import java.util.*;
public class dice {
    public static void printDice(String up, int target){
        if(target==0){
            System.out.print(up+" ");
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++){
            printDice(up+i, target-i);
        }
    }
    public static List<String> printDiceRet(String up, int target){
        if(target==0){
            List<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        List<String> ans = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++){
            ans.addAll(printDiceRet(up+i, target-i));
        }
        return ans;
    }
    public static void main(String[] args) {
        printDice("", 4);
        System.out.println();
        System.out.println(printDiceRet("", 4));
    }
    
    
}
