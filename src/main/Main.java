package main;

import org.json.JSONObject;

public class Main {
	public static JSONObject getJSONObj() {
		JSONObject obj = new JSONObject(Connect.start());
		return obj;
	}

	public static void main(String[] args) {
		Weather w = new Weather();
		Wind wind = new Wind();

		System.out.println(w.getTemp());
		System.out.println(w.getHumidity());
		System.out.println(wind.getWindSpeed());
		System.out.println(wind.getDegree());

	}

}
