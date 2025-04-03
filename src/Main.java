public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        Event e1 = new Event("something",3.50);
        Event e2 = new Event("Weezer",1000000,"21st february","Mcdonald's basement");
        System.out.println(e1.getLocation());
        System.out.println(e2.getLocation());
        System.out.println();

        reservationSystem.addEventToTotalList(e1);
        reservationSystem.addEventToTotalList(e2);
        System.out.println();

        Customer customer1 = new Customer("Joe","Mama");
        Customer customer2 = new Customer("John","Pork","JohnPork@gmail.com");
        reservationSystem.addCustomerToTotalList(customer1);
        reservationSystem.addCustomerToTotalList(customer2);
        System.out.println();

        reservationSystem.makeReservation(customer1,e1);
        reservationSystem.makeReservation(customer2,e1);
        reservationSystem.makeReservation(customer1,e2);
        System.out.println();

        System.out.println(customer1.getReservationList());
        System.out.println();

        reservationSystem.findEvent("Freakbob");
        reservationSystem.findEvent("Weezer");
        System.out.println();

        reservationSystem.findCustomer("John","Pork");
        reservationSystem.findCustomer("Hugh","Mungus");
        reservationSystem.findCustomer("Freak","Bob");
        System.out.println();

        reservationSystem.changeEventPrice("something",30);
        customer1.displayReservationList();
        System.out.println();

        customer2.removeFromReservationList(e2);
        System.out.println("seats available: " + e2.getAvailableSeats());

        System.out.println("seats available: " + e1.getAvailableSeats());
        System.out.println();

    }

}
