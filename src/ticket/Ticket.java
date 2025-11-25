package ticket;

public class Ticket {
    private static int nextId=1;
    private final int ticketId;
    private float prix;

    public Ticket(float prix){
        this.ticketId = nextId++;
        this.prix = prix;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String afficherTicket() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", prix=" + prix +
                '}';
    }
}
