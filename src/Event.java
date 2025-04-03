public class Event {
    private String name;
    private String date;
    private String Location = "somewhere";
    private int maxNumberOfSeats = 100;
    private int availableSeats = maxNumberOfSeats;
    private double price;

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        Location = location;
    }
    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }
    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Event(String name, double price) {
        this.name = name;
        this.price = price;

    }
    public Event(String name, double price, String date) {
        this.name = name;
        this.price = price;
        this.date = date;

    }
    public Event(String name, double price, String date, String location) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.Location = location;

    }
    public String eventInfo(Event event){
        return "Name: " + event.getName() + ", Date: " + event.getDate() + ", Price: " + event.getPrice() + ", Location: " + event.getLocation();
    }
    public void reserve1Seat(){
        System.out.println();
        System.out.println("Reserved 1 Seat");
        availableSeats--;
        System.out.println(availableSeats + " available seats");
        System.out.println();
    }
    public void unreserve1Seat(){
        System.out.println();
        System.out.println("Unreserved 1 Seat");
        availableSeats++;
        System.out.println(availableSeats + " available seats");
        System.out.println();
    }


}
