package logic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyApplication {

	static String DEPARTURE_DATE = "25/03/2020 20:00";

	// Input: 24 hour date format. This method receives an already formatted date
	public boolean isDepartureDate(String inputDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		// Departure date
		Date departureDate = sdf.parse(DEPARTURE_DATE);

		// Date to check
		Date dateToCheck = sdf.parse(inputDate);


		return departureDate.equals(dateToCheck);

	}

}
