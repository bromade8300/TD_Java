package TD_7.Exo2;

import TD_7.Exo2.Classes.Humain;
import TD_7.Exo2.Classes.Item;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        Item livre = new Item("livre","je décris",12.7);
        Item porsche = new Item("voiture","je décris",1222222.7);

        items.add(porsche);

        Humain humain = new Humain(items);

        humain.receiveItem(porsche);
        humain.receiveItem(livre);
        humain.receiveItem(livre);

        humain.sayBilanItems();
    }
}
