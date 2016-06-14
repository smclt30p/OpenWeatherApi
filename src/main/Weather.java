package main;

import org.json.JSONObject;

class Weather {

	private JSONObject main = Main.getJSONObj().getJSONObject("main");
	private int cels = (int) main.getLong("temp") - 273;
	private int hum = main.getInt("humidity");

	StringBuilder getTemp() {
		StringBuilder temp = new StringBuilder();
		temp.append("Temperature in ");
		temp.append(Main.getJSONObj().get("name"));
		temp.append(" is: ");
		temp.append(cels);
		temp.append("c");
		return temp;
	}

	StringBuilder getHumidity() {
		StringBuilder humidity = new StringBuilder();
		humidity.append("Humidity: ")
				.append(hum)
				.append("%");
		return humidity;
	}

}
