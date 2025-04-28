package ride_booking_system;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class RideBookingSystem {
	private List<Customer> customers = new ArrayList<>();
	private List<Driver> drivers = new ArrayList<>();
	private List<Ride> rides = new ArrayList<>();

	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}

	public void registerDriver(Driver driver) {
		drivers.add(driver);
	}

	public Ride bookRide(Customer customer) {
		Driver availableDriver = drivers.stream().filter(Driver::isAvailable).findFirst()
				.orElseThrow(() -> new InvalidRideException("No available drivers!"));
		availableDriver.setAvailable(false);
		Ride ride = new Ride(customer, availableDriver);
		rides.add(ride);
		return ride;
	}

	public void saveRides() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("rides.txt"))) {
			for (Ride ride : rides) {
				writer.write(ride.rideDetails());
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error saving rides: " + e.getMessage());
		}
	}

	public void loadDriversFromFile() {
		try (BufferedReader reader = new BufferedReader(new FileReader("drivers.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 2) {
					registerDriver(new Driver(data[0].trim(), data[1].trim()));
				}
			}
		} catch (IOException e) {
			System.out.println("Error loading drivers: " + e.getMessage());
		}
	}

	public void saveDriversToFile() {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("drivers.txt"))) {
			for (Driver driver : drivers) {
				writer.write(driver.id + "," + driver.name);
				writer.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error saving drivers: " + e.getMessage());
		}
	}

	public void showAllDrivers() {
		drivers.forEach(Driver::showProfile);
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	
}