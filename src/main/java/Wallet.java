import java.util.ArrayList;

public class Wallet implements IScan {
    private String name;
    private ArrayList<IScan> wallet;
//    private ArrayList<CreditCard> creditCards;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
        this.wallet = new ArrayList<IScan>();
//        this.creditCards = new ArrayList<CreditCard>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
//        this.tickets = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.wallet.size();
    }

    public void addItem(IScan item) {
        this.wallet.add(item);
    }

    public String scan() {
        return "wallet scanned";
    }

}
