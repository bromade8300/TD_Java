package TD_7.Exo2.Classes;

import java.util.ArrayList;
import java.util.List;

public class Humain {
    private List<Item> receivedItem;
    private List<Item> likedItems;
    private List<Item> unlikedItems;

    public Humain(List<Item> likedItems) {
        this.likedItems = likedItems;
        this.unlikedItems = new ArrayList<Item>();
        this.receivedItem = new ArrayList<>();
    }

    private void sayCadeau(Cadeau cadeau) {
        System.out.println("Super Cadeau: " + cadeau.getDesc());
    }



    private void sayPrice(){
        float totalItemPrice = 0;

        for(Item item : this.unlikedItems){
            totalItemPrice += item.getPrice();
        }

        if(unlikedItems.size()>0){
            System.out.println("Total item price : " + totalItemPrice);
        }
    }

    private boolean checkIsItemLiked(Item item){
        for(Item likedItem : this.likedItems){
            if(item.getItemType().equals(likedItem.getItemType())){
                return true;
            }
        }
        return false;
    }

    private void sayItem(Item item){
        boolean isLiked = checkIsItemLiked(item);
        if(isLiked){
            System.out.println("Item is liked");
        } else {
            System.out.println("Item is not liked");
            unlikedItems.add(item);

        }
    }

    public void sayBilanItems() {
        for(Item item : this.receivedItem){
        switch (item) {
        case Cadeau cadeau -> {
            sayCadeau(cadeau);
        }
        case Item received->{
            sayItem(received);
        }

        }
        }
        sayPrice();
    }

    public void receiveItem(Item item){
        receivedItem.add(item);
    }

    public List<Item> getLikedItems() {
        return likedItems;
    }

    public List<Item> getUnlikedItems() {
        return unlikedItems;
    }
}
