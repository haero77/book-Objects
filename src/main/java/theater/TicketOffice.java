package theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 관람객에게 판매할 티켓과 판매금액 보관
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>(); 

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    public void sellTicketTo(Audience audience) {
        Ticket ticket = getTicket();
        Long ticketFee = audience.buy(ticket);
        plusAmount(ticketFee);
    }
}
