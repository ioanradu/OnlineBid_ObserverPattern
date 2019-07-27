public class Bid {
    private int value;
    private Item item; // licitatia se face pentru fiecare item in parte de aceea folosim doar un item si nu o lista
    private AuctionParticipant owner;

    public Bid(int value, Item item, AuctionParticipant owner) {
        this.value = value;
        this.item = item;
        this.owner = owner;
    }

    public int getValue() {
        return value;
    }

    public Item getItem() {
        return item;
    }

    public String getItemName() {
        return item.getName();
    }
}
