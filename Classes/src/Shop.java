import java.util.ArrayList;
public class Shop {

    ArrayList<Buyer> buyers;
    Shop() {
        buyers = new ArrayList<>();
    }

    void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    void listBuyers() {
        for (Buyer buyer : buyers) {
            System.out.println( buyer.name + " bought " + buyer.iphone.model );
        }
    }
}
