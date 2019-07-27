public class Auction {

    public void start() {
        AuctionParticipant jack = new AuctionParticipant("Jack");
        AuctionParticipant john = new AuctionParticipant("John");

        Item bike = new Item("bike", 12);

        jack.follow(bike);
        john.follow(bike);

        Bid firstBid = new Bid(10, bike, jack); // facem licitatia
        bike.newBid(firstBid);
        Bid anotherBid = new Bid(15, bike, john); // facem licitatia
        bike.newBid(anotherBid);

    }

}
