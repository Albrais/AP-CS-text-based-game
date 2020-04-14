import java.util.ArrayList;


public class Shop {

    private ArrayList<Item> shopInventory;
    public Shop(ArrayList<Item> shopItems){
        shopInventory = shopItems;
    }

    public void purchase(MainCharacter player, int itemIndex){
        if(player.getGold() < shopInventory.get(itemIndex).getGoldValue())
            System.out.println("You do not have enough gold for that item.");
        player.getInventory().add(shopInventory.remove(itemIndex));
    }

    public void listInventory(){
        for(int i =0;  i < shopInventory.size(); i++){
            System.out.print(i);
            System.out.println(": " + shopInventory.get(i).getName());
        }
    }

}
