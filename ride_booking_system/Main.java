package ride_booking_system;

import java.util.*;
import java.util.stream.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		RideBookingSystem system = new RideBookingSystem();
		Scanner sc = new Scanner(System.in);
		system.loadDriversFromFile();

		while (true) {
			System.out.println("\n--- Ride Booking System ---");
			System.out.println("1. Register a Customer");
			System.out.println("2. Register a Driver");
			System.out.println("3. Book a Ride");
			System.out.println("4. Show All Drivers");
			System.out.println("5. Save Data and Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Customer ID: ");
				String customerId = sc.nextLine();
				System.out.print("Enter Customer Name: ");
				String customerName = sc.nextLine();
				system.registerCustomer(new Customer(customerId, customerName));
				break;

			case 2:
				System.out.print("Enter Driver ID: ");
				String driverId = sc.nextLine();
				System.out.print("Enter Driver Name: ");
				String driverName = sc.nextLine();
				system.registerDriver(new Driver(driverId, driverName));
				break;

			case 3:
				System.out.print("Enter Customer ID: ");
				String custId = sc.nextLine();
				Optional<Customer> customerOpt = system.getCustomers().stream().filter(c -> c.id.equals(custId))
						.findFirst();
				if (customerOpt.isPresent()) {
					try {
						Ride ride = system.bookRide(customerOpt.get());
						System.out.println("Ride booked successfully!");
						System.out.println(ride.rideDetails());
					} catch (InvalidRideException e) {
						System.out.println(e.getMessage());
					}
				} else {
					System.out.println("Customer not found!");
				}
				break;

			case 4:
				system.showAllDrivers();
				break;

			case 5:
				system.saveRides();
				system.saveDriversToFile();
				System.out.println("Data saved. Exiting...");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid option. Try again.");
			}
		}
	}
}