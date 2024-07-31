import java.util.ArrayList;
import java.util.*;

public class Ticket {
    private static int ticketcounter=1;
    private int ticketId;
    private List<passenger> passengers;
    private String trainName;
    private String date;
    private String source;
    private String destination;
    
    public Ticket(String trainName,String date,String source,String destination){
        this.ticketId=ticketcounter++;
        this.trainName=trainName;
        this.date=date;
        this.source=source;
        this.destination=destination;
        this.passengers=new ArrayList<>();
    }

    public void addPassenger(passenger passenger){
        passengers.add(passenger);
    }

    public int getTicketId(){
        return ticketId;
    }

    public List<passenger> getPassengers(){
        return passengers;
    }

    public String getTrainName(){
        return trainName;
    }

    public String getDate(){
        return date;
    }

    public String getSource(){
        return source;
    }

    public String getDestination(){
        return destination;
    }

    @Override
    public String toString(){
        return "Ticket Id: "+ ticketId +"\nTrain: "+ trainName +"\nDate: "+date+"\nSource: "+source+ "\ndestination: "+destination+"\nPassengers"+passengers.size();
    }
}
