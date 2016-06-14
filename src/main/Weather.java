package main;

import org.json.JSONObject;

public class Weather {
	JSONObject main = Main.getJSONObj().getJSONObject("main");

	double cels = (double) main.get("temp") - 273;
	int celsNoDecs = (int) cels;

	int hum = (int) main.get("humidity");

	public StringBuffer getTemp() {
		StringBuffer temp = new StringBuffer();
		temp.append("Temperature in ");
		temp.append(Main.getJSONObj().get("name"));
		temp.append(" is: ");
		temp.append(celsNoDecs);
		temp.append("c");
		return temp;
	}

	public StringBuffer getHumidity() {
		StringBuffer humidity = new StringBuffer();
		humidity.append("Humidity: " + hum);
		humidity.append("%");
		return humidity;
	}

}
