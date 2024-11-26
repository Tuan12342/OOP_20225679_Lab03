public class Store {
    private final DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore[qtyInStore] = dvd;
        qtyInStore++;
        System.out.println("add DVD successfully");
    }

    public void removeDVD(DigitalVideoDisc dvd){
        for(int i = 0;i < qtyInStore;i++){
            if(itemsInStore[i] == dvd){
                for(int j = i;j < qtyInStore - 1;j++){
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("Successfully remove the DVD");
                return;
            }
        }
        System.out.println("DVD not found in the store");
    }

    public void printStore(){
        System.out.println("DVD List in store:");
        if(qtyInStore == 0){
            System.out.println("The store is empty.");
        }
        else {
            for(int i = 0;i < qtyInStore;i++){
                System.out.println((i + 1) + ". " + itemsInStore[i].getTitle());
            }
        }
    }
}