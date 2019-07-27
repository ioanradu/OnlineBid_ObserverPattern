public class AuctionParticipant extends Observator {
    private int budget; // ramane ca tema

    public AuctionParticipant(String name) {
        super(name);
    }

    @Override
    public void update(Bid bid) {
        // should be called when the subjects(Item) change their state
        System.out.println(name + ": New bid for " + bid.getItemName() + " with value: " + bid.getValue());
    }
}
