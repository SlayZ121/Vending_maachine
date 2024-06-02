package inventory;
import item.ItemShelf;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n){
        inventory=new ItemShelf[n];
        initialEmptyInventory();
    }

    public void initialEmptyInventory(){
        int startCode=101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf itemShelf=new ItemShelf();
            itemShelf.setItemCode(startCode);
            itemShelf.setSoldOut(true);
            inventory[i]=itemShelf;
            startCode++;
        }

    }


}
