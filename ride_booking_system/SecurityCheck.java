package ride_booking_system;
import java.lang.annotation.*;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface SecurityCheck {
	String role();
	

}
