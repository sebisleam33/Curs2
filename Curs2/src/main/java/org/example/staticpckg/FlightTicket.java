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
        createTicket(1, "Economy", 123456);
        createTicket(2, "Business", 123457);
        createTicket(3, "Economy", 123458);
    }

    private static void createTicket(int i, String economy, int i2) {
        if (availableSeats > 0) {
            FlightTicket ticket1 = new FlightTicket(1122, i, economy, i2);
            ticket1.availableSeats--;
            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println("There are no more tickets available.");
        }
    }
}
