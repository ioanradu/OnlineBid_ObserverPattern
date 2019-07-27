public class Main {

    public static void main(String[] args) {

        Item bike = new Item("bike", 12);
        Item car = new Item("car", 10000);

        Auction auction = new Auction();
        auction.start();
    }
}
