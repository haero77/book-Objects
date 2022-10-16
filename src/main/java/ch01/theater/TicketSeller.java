package ch01.theater;

// 판매원. 매표소에서 초대장을 티켓으로 교환해주거나 티켓을 판매하는 역할 수행
public class TicketSeller {
    private TicketOffice ticketOffice; // 자신이 일하는 매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    }
}

