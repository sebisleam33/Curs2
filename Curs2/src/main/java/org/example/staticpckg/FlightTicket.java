package org.example.staticpckg;

public class FlightTicket {
    public int flightNumber;
    public int seatNumber;
    public String ticketCategory;
    public int ticketId;

    public static int availableSeats = 50;

    public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int ticketId) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.ticketCategory = ticketCategory;
        this.ticketId = ticketId;
    }

    public static void main(String[] args) {
        FlightTicket ticket1 = new FlightTicket(1122, 1, "Economy", 12345);
        ticket1.availableSeats--;
    }
}
