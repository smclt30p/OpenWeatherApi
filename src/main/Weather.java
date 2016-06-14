package main;

import org.json.JSONObject;

public class Weather {
	JSONObject main = Main.getJSONObj().getJSONObject("main");

	long cels = main.getLong("temp") - 273;
	int celsNoDecs = (int) cels;

	int hum = (int) main.get("humidity");

	public StringBuilder getTemp() {
		StringBuilder temp = new StringBuilder();
		temp.append("Temperature in ");
		temp.append(Main.getJSONObj().get("name"));
		temp.append(" is: ");
		temp.append(celsNoDecs);
		temp.append("c");
		return temp;
	}

	public StringBuilder getHumidity() {
		StringBuilder humidity = new StringBuilder();
		humidity.append("Humidity: " + hum);
		humidity.append("%");
		return humidity;
	}

}
