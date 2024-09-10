import java.util.ArrayList;
import java.util.List;

public class RailwayReservationSysytem {
    private List<Ticket> tickets;

    public RailwayReservationSysytem(){
        tickets=new ArrayList<>();
    }

    public Ticket bookTicket(String trainName,String date,String source,String destination,List<passenger> passengers){
        Ticket ticket =new Ticket(trainName, date, source, destination);
        for (passenger passenger : passengers) {
            ticket.addPassenger(passenger);
        }
        tickets.add(ticket);
        return ticket;
    }

    public boolean cancelTicket(int ticketId){
        for (Ticket ticket : tickets) {
            if (ticket.getTicketId()==ticketId) {
                tickets.remove(ticket);
                return true;
            }
        }
        return false;
    }

    public void showAllTickets(){
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }

    public static void main(String[] args) {
        RailwayReservationSysytem system=new RailwayReservationSysytem();

        passenger p1 = new passenger("Alice", 30, "Female");
        passenger p2 = new passenger("Bob", 25, "Male");
        List<passenger> passengers=new ArrayList<>();
        passengers.add(p1);
        passengers.add(p2);

        Ticket ticket1=system.bookTicket("express train", "25", "chennai", "banglore", passengers);
        System.out.println(ticket1);

        system.showAllTickets();

        boolean isCancelled=system.cancelTicket(ticket1.getTicketId());
        if (isCancelled) {
            System.out.println("ticket is cancelled successfully");
        }
        else{
            System.out.println("failed");
        }

        system.showAllTickets();
    }
}
