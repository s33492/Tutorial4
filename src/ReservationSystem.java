import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList <Event> allEventsList = new ArrayList<>();
    private ArrayList <Customer> allCustomersList = new ArrayList<>();

    public ArrayList<Customer> getAllCustomersList() {
        return allCustomersList;
    }
    public ArrayList<Event> getAllEventsList() {
        return allEventsList;
    }
    public void addEventToTotalList(Event event) {
        System.out.println("Adding event");
        allEventsList.add(event);
        System.out.println("Event added");
        System.out.println("Number of events: " + allEventsList.size());
        System.out.println();
    }
    public void addCustomerToTotalList(Customer customer) {
        System.out.println("Adding customer");
        allCustomersList.add(customer);
        System.out.println("Customer added");
        System.out.println("Number of customers: " + allCustomersList.size());
        System.out.println();
    }
    public void makeReservation(Customer customer,Event event) {
        customer.addToReservationList(event);
    }
    public void findEvent(String eventName) {
        System.out.println("Finding event");
        boolean found = false;
        for (Event event : allEventsList) {
            if (event.getName().equals(eventName)) {
                found = true;
                System.out.println("Event found");
            }
        }
        if (!found) {
            System.out.println("Event not found");
        }
        System.out.println();
    }
    public void findCustomer(String firstName,String lastName) {
        System.out.println("Finding customer");
        boolean custFound = false;
        for (Customer customer : allCustomersList) {
            if (customer.getLastName().equals(lastName)) {
                if (customer.getFirstName().equals(firstName)) {
                    custFound = true;
                    System.out.println("Customer found");

                }
            }
        }
        if (!custFound) {
            System.out.println("Customer not found");
        }
        System.out.println();
    }
    public void changeEventPrice(String eventName, int newPrice) {
        System.out.println("Changing event price");
        System.out.println("finding event");
        for (Event event : allEventsList) {
            if (event.getName().equals(eventName)) {
                System.out.println("Event found");
                event.setPrice(newPrice);
                System.out.println("Event price changed to: " + newPrice);
                break;
            }
            else {
                System.out.println("Event not found");
            }
        }
    }

}
