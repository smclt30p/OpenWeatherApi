package main;

import org.json.JSONObject;

public class Main {

	static JSONObject getJSONObj() {
		return new JSONObject(Connect.start());
	}

	public static void main(String[] args) {

		Weather w = new Weather();
		Wind wind = new Wind();

		System.out.println(w.getTemp() + "\n" + w.getHumidity() + "\n" + wind.getWindSpeed() + "\n" + wind.getDegree());

	}

}
