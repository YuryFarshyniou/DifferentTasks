package examples.by.yurachel.blinov.patterns.behavioral_patterns.observer.example;

// Делать ставу.
public class Bid {
    private int id;
    private double price;
    private AuctionObserver observer;
    private boolean leader = false;

    public Bid(int id, double price) {
        super();
        this.id = id;
        this.price = price;
    }

    public void changePrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    public boolean isLeader() {
        return leader;
    }

    public void addObserver(AuctionObserver observer) {
        this.observer = observer;
        observer.addObservable(this);
    }

    public void removeObserver() {
        observer.removeObserver(this);
        observer = null;
    }
    private void notifyObservers(){
        if(observer!=null){
            observer.handleEvent(new BidEvent(this));

        }
    }

    @Override
    public String toString() {
        return "Bid{" +
                "id=" + id +
                ", price=" + price +
                ", observer=" + observer +
                ", leader=" + leader +
                '}';
    }
}
