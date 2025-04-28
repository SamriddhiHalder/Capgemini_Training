package ride_booking_system;

import java.lang.reflect.*;
import java.util.*;

@SecurityCheck(role = "Admin")
public class Admin extends User {
	Admin(String id, String name) {
		super(id, name);

	}

	@Override
	public
	void showProfile() {
		Class<SecurityCheck> c = SecurityCheck.class;
		SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);
		// TODO Auto-generated method stub
		System.out.println("Admin Name:" + name + " Role:" + s.role());
	}

	public void removeDriver(List<Driver> drivers, String driverId) {
		Class<?> clazz = this.getClass();
		if (clazz.isAnnotationPresent(SecurityCheck.class)) {
			SecurityCheck sc = clazz.getAnnotation(SecurityCheck.class);
			if ("Admin".equals(sc.role())) {
				Iterator<Driver> iterator = drivers.iterator();
				while (iterator.hasNext()) {
					Driver driver = iterator.next();
					if (driver.id.equals(driverId)) {
						iterator.remove();
						System.out.println("Driver removed successfully.");
						return;
					}
				}
				System.out.println("Driver with ID " + driverId + " not found.");
			} else {
				System.out.println("Unauthorized operation.");
			}
		}
	}
}
