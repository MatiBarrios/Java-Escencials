import java.util.ArrayList;

public class BuyList {
    public static void main (String args[]){
        ArrayList<String> buyList=new ArrayList<>();
        buyList.add("Milk");
        buyList.add("Cheese");
        System.out.println(buyList);

        ArrayList<String> afterBuyList = new ArrayList<>(buyList);
        afterBuyList.add("Camara");
        System.out.println(afterBuyList);
        afterBuyList.set(1, "ball");
        System.out.println(afterBuyList);
        afterBuyList.remove(0);
        System.out.println(afterBuyList);
    }
}
