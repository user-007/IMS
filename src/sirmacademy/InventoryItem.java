package sirmacademy;

import java.util.List;
import java.util.UUID;

class InventoryItem extends AbstractItem {
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String itemID;
    private int quantity;
    InventoryItem(){
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        this.itemID = uuidAsString;

    }
    @Override
    public boolean isBreakble() {
        return false;
    }

    @Override
    public void handleItemBreakage() {

    }

    @Override
    public Object setItemCategory() {
        return null;
    }

    @Override
    public Object getItemCategory() {
        return null;
    }

    @Override
    public boolean isPerishable() {
        return false;
    }

    @Override
    public void handleItemExpiration() {

    }

0    @Override
    public void setItemPrices() {

    }

    @Override
    public List<String> getItemPrices() {
        return List.of();
    }
}
