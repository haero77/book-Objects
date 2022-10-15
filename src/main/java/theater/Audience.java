package theater;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        bag.setTicket(ticket);

        if (bag.hasInvitation()) {
            return 0L;
        }

        bag.minusAmount(ticket.getFee());
        return ticket.getFee();
    }
}
