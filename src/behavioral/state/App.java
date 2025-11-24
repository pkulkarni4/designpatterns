package behavioral.state;

public class App {
    public static void main(String[] args) {
        var auction = new Auction();

        auction.startAuction();
        auction.placeBid();

        auction.startAuction();
        auction.closeAuction();

        auction.placeBid();
        auction.closeAuction();
        //
        System.out.println();

        var mediaPlayer = new MediaPlayerUserInterface();
        mediaPlayer.pressButton();
        mediaPlayer.pressButton();
    }
}
