package theater;

// 관람객이 소지품을 보관하는 Bag
public class Bag {
    private Long amount; // 현금
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(null, amount); // 이벤트에 당첨되지 않은 관람객의 가방에는 초대장이 들어있지 않다.
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
